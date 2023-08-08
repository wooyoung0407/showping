package com.example.book.home;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @PreAuthorize("isAuthentication()")
    @GetMapping("/")
    public String index() {
        return "home/main";
    }
}
