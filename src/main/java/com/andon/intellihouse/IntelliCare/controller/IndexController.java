package com.andon.intellihouse.IntelliCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by yangzhi
 * @date 2018.09.10 09:53
 * @Moode o_O
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String Index()
    {
        return "/index";
    }
}
