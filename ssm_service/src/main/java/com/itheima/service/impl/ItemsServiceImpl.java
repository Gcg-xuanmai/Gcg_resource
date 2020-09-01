package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 炫迈
 * 创建时间：2020/8/31 20:08
 * 描述：
 */
@Service("itemService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    /***
     * 列表查询
     * @return
     */
    public List<Items> list() {
        return itemsDao.list();
    }

    /***
     * 增加商品
     * @param items
     * @return
     */
    public int save(Items items) {
        int account = itemsDao.save(items);
        System.out.println("account:"+account);
        return account;
    }
}
