package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Xiaok
 * @Date: 2019/8/22 16:12
 * @version: 1.0
 * @Description:
 */

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request){
        return "index";
    }

}
