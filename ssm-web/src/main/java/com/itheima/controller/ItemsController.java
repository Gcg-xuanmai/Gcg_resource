package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: 炫迈
 * 创建时间：2020/8/31 20:13
 * 描述：
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
    /**
     * 查询商品列表
     */
    @RequestMapping("/list")
    public String list(Model model){
        List<Items> list = itemsService.list();
        model.addAttribute("items",list);
        return "items";
    }


    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(Items items){
        int rs = itemsService.save(items);
        return "redirect:/items/list";
    }
}
