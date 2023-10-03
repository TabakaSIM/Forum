package pl.tabaka.forum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.tabaka.forum.models.User;
import pl.tabaka.forum.service.IUserService;

@Controller
public class LoginRegisterController {
    @Autowired
    IUserService userService;

    @GetMapping(path = "/register")
    public String register(@RequestParam(required = false) String pattern){
        return "register";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute User user, @RequestParam String password){
        System.out.println(password);
        System.out.println(user);
        return("redirect:/register");
    }
}
