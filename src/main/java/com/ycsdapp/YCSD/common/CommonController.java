package com.ycsdapp.YCSD.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/common")
public class CommonController {

    @RequestMapping("/moveMainPage")
    public String moveMainPage(){
        return "common/main";
    }
}
