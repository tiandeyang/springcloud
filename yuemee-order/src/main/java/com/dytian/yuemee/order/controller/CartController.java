package com.dytian.yuemee.order.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dytian.yuemee.common.entity.Jd_user;
import com.dytian.yuemee.order.entity.JdCart;
import com.dytian.yuemee.order.service.IJdCartService;
import org.nutz.json.Json;
import org.nutz.mvc.annotation.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    IJdCartService iJdCartService;

    @GetMapping("/carts")
    public String getCarts(){

        Page<JdCart> page = new Page<>();
        page.setPages(1);
        page.setSize(3);

        QueryWrapper<JdCart> where = new QueryWrapper<>();
        where.eq(JdCart.USER_ID,209);

        IPage<JdCart> page1 = iJdCartService.page(page, where);
        System.out.println(Json.toJson(page1.getRecords()));

        return "ok";
    }


    @PostMapping("/addcarts")
    public String addCarts(@RequestBody JdCart jdCart){





//
//        Page<JdCart> page = new Page<>();
//        page.setPages(1);
//        page.setSize(3);
//
//        QueryWrapper<JdCart> where = new QueryWrapper<>();
//        where.eq(JdCart.USER_ID,209);
//
//        IPage<JdCart> page1 = iJdCartService.page(page, where);
//        System.out.println(Json.toJson(page1.getRecords()));

        return "ok";
    }

}
