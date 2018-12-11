package com.dytian.yuemee.user.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dytian.yuemee.common.BurroKit;
import com.dytian.yuemee.common.entity.Jd_user;
import com.dytian.yuemee.common.entity.Jd_user_info;
import com.dytian.yuemee.common.entity.User_finance;
import com.dytian.yuemee.common.entity.User_relation;

import com.dytian.yuemee.user.service.IJd_userService;
import com.dytian.yuemee.user.service.IJd_user_infoService;
import com.dytian.yuemee.user.service.IUser_financeService;
import com.dytian.yuemee.user.service.IUser_relationService;
import org.nutz.json.Json;
import org.nutz.lang.Times;
import org.nutz.mvc.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;


/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
@RestController
public class Jd_userController {


    @Value("${server.port}")
    String port;

    @Autowired
    IJd_userService iJd_userService;

    @Autowired
    IJd_user_infoService iJd_user_infoService;

    @Autowired
    IUser_financeService iUser_financeService;

    @Autowired
    IUser_relationService iUser_relationService;


    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestBody Jd_user user) {


      //  Jd_user user = Json.fromJson(Jd_user.class, userStr);
        System.out.println("user==addUser="+Json.toJson(user));
        String app_wx_id = user.getApp_wx_id();

        user.setWallet(new BigDecimal(0));
        user.setCreate_time(BurroKit.current());
        iJd_userService.insert(user);

        EntityWrapper<Jd_user> where = new EntityWrapper();
        where.eq("app_wx_id", app_wx_id);
        ArrayList<String> orderbys = new ArrayList<>();
        orderbys.add("create_time");
        where.orderDesc(orderbys);
        Jd_user jd_user = iJd_userService.selectOne(where);


        EntityWrapper<User_relation> user_relation_where = new EntityWrapper<>();
        user_relation_where.eq("inviter_id", jd_user.getUser_id());


        User_finance userFinance = new User_finance();
        userFinance.setUser_id(jd_user.getUser_id());
        userFinance.setCoin(new BigDecimal(0));
        userFinance.setCheif_status(0);
        userFinance.setDirect_recruit_status(0);
        userFinance.setProfit_self(new BigDecimal(0));
        userFinance.setProfit_share(new BigDecimal(0));
        userFinance.setRecruit_alt(new BigDecimal(0));
        userFinance.setRecruit_dir(new BigDecimal(0));
        userFinance.setThew_target(new BigDecimal(0));
        userFinance.setCheif_start(Times.now().getTime());
        userFinance.setDirector_start(Times.now().getTime());
        userFinance.setCheif_expire(Times.now().getTime() + 365 * 24 * 60 * 60 * 1000);
        userFinance.setMoney(new BigDecimal(0));
        userFinance.setCheif_expire(Times.now().getTime() + 365 * 24 * 60 * 60 * 1000);
        iUser_financeService.insert(userFinance);

        Jd_user_info jdUserInfo = new Jd_user_info();
        jdUserInfo.setCreate_time(BurroKit.current());
        jdUserInfo.setUser_id(jd_user.getUser_id());
        jdUserInfo.setId_back_image("");
        jdUserInfo.setId_front_image("");
        jdUserInfo.setId_number("");
        jdUserInfo.setOpen_bank_name("");
        jdUserInfo.setVerify_status(0);
        jdUserInfo.setUser_name("");
        jdUserInfo.setUser_phone("");
        iJd_user_infoService.insert(jdUserInfo);
        System.out.println(Json.toJson(jd_user));
        return jd_user.getApp_wx_id();
    }


}

