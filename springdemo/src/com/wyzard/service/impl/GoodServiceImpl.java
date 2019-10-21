package com.wyzard.service.impl;

import com.wyzard.dao.GoodDao;
import com.wyzard.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
//@Service("goodService")
public class GoodServiceImpl implements GoodService {
 //@Autowired
  private GoodDao goodDao;

    public void setGoodDao(GoodDao goodDao) {
        this.goodDao = goodDao;
    }

    @Override
    public void buyGoods(String username, String id) {
        //查钱
        int price = goodDao.findPriceById(id);
        //改数目
        goodDao.updateGoods(id);
        //改余额
        goodDao.updateBalance(username,price);
    }
}
