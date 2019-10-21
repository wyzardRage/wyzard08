package com.wyzard.dao;

public interface GoodDao {
    public int findPriceById(String id );
    public void updateGoods(String id);
    public void updateBalance(String username,int price);

}
