package com.zpj.springbootdemo.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringBootController {
    @RequestMapping("/flow")
    public String index() {
        return "flow";
    }


}
