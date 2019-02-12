package com.supplier.commodity.service.impl;


import com.supplier.commons.bean.commodity.Goods;
import com.supplier.commons.itf.CommodityServiceApi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhenhai.zheng on 2018/11/29.
 */
@Service
public class CommodityServiceImpl implements CommodityServiceApi {

    private static Map<String,Goods> goodsMap = new HashMap<>();

    static {
        goodsMap.put("apple",new Goods("apple",3.8));
        goodsMap.put("orange",new Goods("orange",5.00));
        goodsMap.put("Spicy strips",new Goods("Spicy strips",0.5));
        goodsMap.put("noodles",new Goods("noodles",2.5));
    }

    @Override
    public String addCommodity(String name,double price) {
        goodsMap.put(name,new Goods(name,price));
        return "add success and name is " + name;
    }

    @Override
    public Goods getCommodityInfoByName(String name) {
        return goodsMap.get(name);
    }

    @Override
    public List<Goods> getAllCommodityInfo() {
        List<Goods> goodsList = new ArrayList<>();
        goodsMap.forEach((k,v) -> {
            goodsList.add(v);
        });
        return goodsList;
    }
}
