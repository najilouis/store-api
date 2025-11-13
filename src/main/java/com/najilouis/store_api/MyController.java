package com.najilouis.store_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String index(){
        System.out.println("naji======");
        return "abc";
    }
}
