package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Says I'm a controller come and get me
@Controller
public class BaseController {

    //When we request off the base route return the index
    @RequestMapping("/")
    public String baseRoute() {
        return "index";
    }
}
