package de.takeiteasy.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String login() {

        return "/src/main/webapp/login.jsp";
    }
}
