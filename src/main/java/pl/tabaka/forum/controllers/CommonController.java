package pl.tabaka.forum.controllers;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.tabaka.forum.service.IPostService;
import pl.tabaka.forum.session.SessionData;

@Controller
public class CommonController {

    @Autowired
    private IPostService postService;

    @Resource
    SessionData sessionData;

    @GetMapping(path = {"", "/"})
    public String main(Model model, @RequestParam(required = false) String pattern){
        model.addAttribute("posts", this.postService.getAllPosts());
        return "index";
    }

    @GetMapping(path = "/contact")
    public String contact(@RequestParam(required = false) String pattern){
        return "contact";
    }
}
