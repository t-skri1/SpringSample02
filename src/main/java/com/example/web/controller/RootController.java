package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        // "redirect:"を先頭につけるとリダイレクトになる
        return "redirect:productsMaster/index";
    }

}