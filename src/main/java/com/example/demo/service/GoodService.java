package com.example.demo.service;

import com.example.demo.pojo.Good;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  15:16
 */

public interface GoodService {
    public List<Good> getAllOfficeGood() ;
    public List<Good> getAllDayUse() ;
    public List<Good> getAllFood() ;
    public List<Good> getAllDrink() ;
    public List<Good> getAll() ;
    public List<String> getAllgoodType() ;
    public void addGood(Good good) ;
    public List<Good> getAllgoodByType(String goodType) ;
    List<Good> getAllGoodByGoodTypeAndGoodName(String goodType , String goodName) ;
    List<String> getAllgoodNameByType(String goodType) ;
    Integer queryTotalRecords(String Type);
    List<Good> queryLimitAccounts(Integer start , Integer pages, String Type);
}
