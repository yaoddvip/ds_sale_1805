package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yaodd on 2018/11/5.
 */
@Controller
public class IndexController {

    @RequestMapping("/toMainPage")
    public String toMainPage(){
        return "index";
    }

    @RequestMapping("/toLoginPage")
    public String toLoginPage(){
        return "login";
    }

}
