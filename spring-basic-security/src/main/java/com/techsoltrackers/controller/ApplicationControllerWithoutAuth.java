package com.techsoltrackers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class ApplicationControllerWithoutAuth {

    @GetMapping("/getMsg")
    public String getMsg() {
        return "spring Basic security without authorization example";
    }
}
