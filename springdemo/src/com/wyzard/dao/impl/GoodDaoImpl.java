package com.wyzard.dao.impl;

import com.wyzard.HaHaException;
import com.wyzard.dao.GoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Repository("goodDao")
public class GoodDaoImpl implements GoodDao {
   // @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int findPriceById(String id) {
        String sql="select price from goods where id=?";

        return jdbcTemplate.queryForObject(sql,Integer.class,id);
    }

    @Override
    public void updateGoods(String id) {
        String sql1 = "select number from good_numbers where id=?";
        int number = jdbcTemplate.queryForObject(sql1,Integer.class,id);
        if(number==0){
            throw  new HaHaException("没货了");
        }
        String sql="update good_numbers set number = number-1 where id=?";
         jdbcTemplate.update(sql,id);

    }

    @Override
    public void updateBalance(String username, int price) {
        String sql1 = "select balance from gusers where username=?";
        int balance = jdbcTemplate.queryForObject(sql1,Integer.class,username);
        if (balance-price<0){
            throw  new HaHaException("没钱了");
        }
        String sql="update gusers set balance = balance-? where username=?";
        jdbcTemplate.update(sql,price,username);
    }
}
