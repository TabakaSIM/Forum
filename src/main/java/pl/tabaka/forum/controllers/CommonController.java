package pl.tabaka.forum.controllers;

import com.fasterxml.jackson.core.JsonToken;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.tabaka.forum.service.IPostService;
import pl.tabaka.forum.service.IUserService;
import pl.tabaka.forum.session.SessionData;

@Controller
public class CommonController {

    @Autowired
    private IPostService postService;
    @Autowired
    private IUserService userService;

    //@Resource
    //SessionData sessionData;

    @GetMapping(path = {"", "/"})
    public String main(Model model, @RequestParam(required = false) String pattern){
        model.addAttribute("posts", this.postService.getAllPosts());
        model.addAttribute("isLogged", this.userService.isPresentUser());
        if(this.userService.isPresentUser()) model.addAttribute("userLogin", this.userService.getUser().get().getLogin());
        return "index";
    }


    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public String login(@RequestParam(required = false) String login, @RequestParam(required = false) String password){
        System.out.println(login);
        if (login.equals("NOT") && password.equals("SEEN?")){
            this.userService.logout();
            System.out.println("Wylogowano!");
        }

        else {
            this.userService.login(login, password);
            System.out.println("Zalogowano!");
        }

        return "redirect:";
    }
}
