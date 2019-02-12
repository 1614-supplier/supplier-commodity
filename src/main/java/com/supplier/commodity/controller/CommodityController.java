package com.supplier.commodity.controller;

import com.supplier.commons.bean.commodity.Goods;
import com.supplier.commons.itf.CommodityServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhenhai.zheng on 2018/6/20.
 */
@RestController
public class CommodityController {

    @Autowired
    private CommodityServiceApi commodityService;

    @RequestMapping(value = "/commodity/addCommodity",method = RequestMethod.GET)
    public String addCommodity(String name,double price){
        return commodityService.addCommodity(name,price);
    }

    @RequestMapping(value = "/commodity/getCommodityInfoByName",method = RequestMethod.GET)
    public Goods getCommodityInfoByName(@RequestParam(value = "name") String name){
        return commodityService.getCommodityInfoByName(name);
    }

    @RequestMapping(value = "/commodity/getAllCommodity",method = RequestMethod.GET)
    public List<Goods> getAllCommodityInfo(){
        return commodityService.getAllCommodityInfo();
    }
}
