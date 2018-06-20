package com.supplier.user.controller;

import com.supplier.api.commodity.itf.CommodityServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hai on 2018/6/20.
 */
@RestController
public class UserController {

    @Autowired
    private CommodityServiceApi schedualServiceHi;

    @RequestMapping(value = "/user/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
