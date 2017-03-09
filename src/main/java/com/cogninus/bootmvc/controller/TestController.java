package com.cogninus.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Cogninus") String name, ModelMap model) {
        model.addAttribute("name", name);
        System.out.println("GRETTINGS, "+ name +"................!");
        return "greeting";
    }
}