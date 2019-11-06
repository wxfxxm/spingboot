package com.xuefeng.testone.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuefeng.wang
 * @version V1.0
 * @Package com.xuefeng.testone.controller
 * @date 2019/11/5 17:59
 * @Copyright © 2019-2020 Bespin
 */

@RestController
public class OtherController {
    private Map<String, Object> params = new HashMap<>();

    @PostMapping("/v1/login")
    public Object login(String id, String pwd){
        params.clear();
        params.put("id", id);
        params.put("pwd", pwd);
        return params;
    }

    @PutMapping("/v1/put")
    public Object put(String id){
        params.clear();
        params.put("id", id);
        return params;
    }

    @DeleteMapping("/v1/del")
    public Object del(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
}
