package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author: 炫迈
 * 创建时间：2020/8/31 20:07
 * 描述：
 */
public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> list();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);


}
