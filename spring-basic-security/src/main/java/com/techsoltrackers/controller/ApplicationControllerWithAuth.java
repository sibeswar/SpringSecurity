package com.techsoltrackers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class ApplicationControllerWithAuth {

    @GetMapping("/getResponse")
    public String getResponse() {
        return "spring Basic security with authorization example";
    }
}
