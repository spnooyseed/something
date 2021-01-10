package com.example.demo.DesignModel.Deractore;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  2:42
 */
@Service
public class GetAllDeratore implements Deractore{
   @Autowired
   private GoodsMapper goodsMapper ;

    @Override
    public List<Good> getAll(Integer start , Integer pages, String Type) {
        return goodsMapper.queryLimitAllAccounts(start , pages);
    }
}