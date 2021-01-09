package com.example.demo.service.impl;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Good;
import com.example.demo.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  15:16
 */
@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    private GoodsMapper goodsMapper ;

    @Override
    public List<Good> getAllOfficeGood() { return goodsMapper.getAllOfficeGood(); }

    @Override
    public List<Good> getAllDayUse() { return goodsMapper.getAllDayUse(); }

    @Override
    public List<Good> getAllFood() { return goodsMapper.getAllFood(); }

    @Override
    public List<Good> getAllDrink() { return goodsMapper.getAllDrink(); }

    @Override
    public List<Good> getAll() { return goodsMapper.getAll(); }

    @Override
    public List<String> getAllgoodType() { return goodsMapper.getAllgoodType() ; }

    @Override
    public void addGood(Good good) { goodsMapper.addGood(good) ; }

    @Override
    public List<Good> getAllgoodByType(String goodType) { return goodsMapper.getAllgoodByType(goodType); }

    @Override
    public List<Good> getAllGoodByGoodTypeAndGoodName(String goodType, String goodName) {
        return goodsMapper.getAllGoodByGoodTypeAndGoodName(goodType , goodName);
    }

    @Override
    public List<String> getAllgoodNameByType(String goodType) { return goodsMapper.getAllgoodNameByType(goodType) ; }

    @Override
    public Integer queryTotalRecords(String Type) {
        System.out.println(Type);
        return goodsMapper.queryTotalRecords(Type);
    }

    @Override
    public List<Good> queryLimitAccounts(Integer start , Integer pages, String Type){
        System.out.println(start + " " + pages + " " + Type) ;
        return goodsMapper.queryLimitAccounts(start , pages , Type);
    }
}
