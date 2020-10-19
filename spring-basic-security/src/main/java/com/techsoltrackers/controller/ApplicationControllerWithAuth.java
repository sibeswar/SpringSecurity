package com.techsoltrackers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class ApplicationControllerWithAuth {

    @GetMapping("/getResponse")
    public String getResponse() {
        return "spring Basic security implementation :: API is accessible by user with Admin role";
    }

    @GetMapping("/getUser")
    public String getUser() {
        return "spring Basic security implementation :: API is accessible by user with any role";
    }
}
