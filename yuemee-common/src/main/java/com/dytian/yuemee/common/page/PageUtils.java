package com.dytian.yuemee.common.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class PageUtils {


    public static Page buildPage(int pageNum){
        Page tPage = new Page<>();
        tPage.setPages(pageNum);
        tPage.setSize(10);
        return tPage;
    }


    public static Page buildPage(int pageNum,int size){
        Page tPage = new Page<>();
        tPage.setPages(pageNum);
        tPage.setSize(size);
        return tPage;
    }



}
