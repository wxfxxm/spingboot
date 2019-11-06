package com.xuefeng.testone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuefeng.wang
 * @version V1.0
 * @Package com.xuefeng.testone.controller
 * @date 2019/11/2 10:29
 * @Copyright © 2019-2020 Bespin
 */
@RestController
public class Controller {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("name", "xdclass");
        return map;
    }

}
