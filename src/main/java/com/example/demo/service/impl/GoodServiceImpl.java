package com.example.demo.service.impl;

import com.example.demo.DesignModel.Deractore.Deractore;
import com.example.demo.DesignModel.Deractore.GetAllDeratore;
import com.example.demo.DesignModel.Deractore.GetByTypeDeratore;
import com.example.demo.DesignModel.Deractore.test;
import com.example.demo.DesignModel.Subject.DatabaseObserver;
import com.example.demo.DesignModel.Subject.Subject;
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

    @Autowired
    private  Subject subject = new Subject() ;
    @Autowired
    private DatabaseObserver databaseObserver ;
    @Override
    public void addGood(Good good) {
        goodsMapper.addGood(good);
        databaseObserver = new DatabaseObserver(subject) ;
        databaseObserver.update();
    }

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

    @Autowired
    private GetByTypeDeratore getByTypeDeratore ;

    @Override
    public List<Good> queryLimitAccounts(Integer start , Integer pages, String Type){
        if(Type.compareTo("1") == 0){
            return getByTypeDeratore.getAll(start , pages , Type) ;
        }
        return getByTypeDeratore.getByType(start,pages,Type) ;
    }

    @Override
    public List<Integer> getGoodIdByName(String goodName) {
        return goodsMapper.getGoodIdByName(goodName);
    }

    @Override
    public List<String> getAllName() {
        return goodsMapper.getAllName();
    }

    @Override
    public Integer queryTotal() {
        return goodsMapper.queryTotal();
    }
}