package com.example.demo.service;

import com.example.demo.pojo.Good;

import java.util.Collection;
import java.util.List;

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
}
