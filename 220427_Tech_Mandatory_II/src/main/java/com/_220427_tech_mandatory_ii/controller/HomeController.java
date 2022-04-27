package com._220427_tech_mandatory_ii.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }
}
