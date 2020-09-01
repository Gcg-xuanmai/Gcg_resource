package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author: 炫迈
 * 创建时间：2020/8/31 19:44
 * 描述：
 */
public interface ItemsDao {

    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
