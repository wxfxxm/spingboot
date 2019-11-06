package com.xuefeng.testone.controller;

import com.xuefeng.testone.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuefeng.wang
 * @version V1.0
 * @Package com.xuefeng.testone.controller
 * @date 2019/11/5 9:19
 * @Copyright © 2019-2020 Bespin
 */

@RestController
public class GetController {
    private Map<String,Object> params = new HashMap<>();

    @RequestMapping(path = "/{city_id}/{user_id}",method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId,
                           @PathVariable("user_id") String userId) {
        params.clear();
        params.put("city_id", cityId);
        params.put("user_id", userId);

        return params;
    }

    @GetMapping(value ="/v1/page_user1")
    public Object pageUer(int from, int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);

        return params;
    }

    @GetMapping(value ="/v1/page_user2")
    public Object pageUer2(@RequestParam(defaultValue = "0", name = "page") int from, int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);

        return params;
    }

    @RequestMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user) {

        params.clear();
        params.put("user", user);

        return params;
    }


}
