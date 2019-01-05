package com.rock.leanmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("hello")
    @ResponseBody
    public Object hello(){
        Map<String,Object> map = new HashMap<>();
        map.put("data","hello world");
        return map;
    }
}
