package pl.tabaka.forum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.tabaka.forum.service.IUserService;

@Controller
public class RegisterController {
    @Autowired
    IUserService userService;

    @GetMapping(path = "/register")
    public String register(@RequestParam(required = false) String pattern){
        return "register";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(@RequestParam String email, @RequestParam String login, @RequestParam String password){
        return userService.registerUser(email, login, password) ? "redirect:/" : "register";
    }
}
