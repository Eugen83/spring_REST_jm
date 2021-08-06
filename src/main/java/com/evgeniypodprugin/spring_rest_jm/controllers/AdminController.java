package com.evgeniypodprugin.spring_rest_jm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/")
    public String getAdminPage() {
        return "admin";
    }
}
