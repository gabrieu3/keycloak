package com.balestech.keycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class WebController {

    @GetMapping(path = "/index")
    public String index() {
        return "external";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        return "redirect:/";
    }

    @GetMapping(path = "/customers")
    public String customers() {
        return "customers";
    }

}