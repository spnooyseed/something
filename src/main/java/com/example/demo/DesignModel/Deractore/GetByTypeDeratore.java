package com.example.demo.DesignModel.Deractore;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  2:55
 */

@Service
public class GetByTypeDeratore extends GetAllDeratore{
    @Autowired
    private GoodsMapper goodsMapper ;

    public List<Good> getByType(Integer start , Integer pages , String Type) {
        return goodsMapper.queryLimitAccounts(start , pages , Type) ;
    }
}