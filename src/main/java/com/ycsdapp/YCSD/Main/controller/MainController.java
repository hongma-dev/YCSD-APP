package com.ycsdapp.YCSD.Main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "main/index";
    }
}
