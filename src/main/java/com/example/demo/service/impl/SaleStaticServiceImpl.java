package com.example.demo.service.impl;

import com.example.demo.mapper.SaleStaticMapper;
import com.example.demo.pojo.Good;
import com.example.demo.pojo.sale_static;
import com.example.demo.service.SaleStaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/9  16:33
 */
@Service
public class SaleStaticServiceImpl implements SaleStaticService {

    @Autowired
    private SaleStaticMapper saleStaticMapper ;
    @Autowired
    private GoodServiceImpl goodService ;


    @Override
    public List<sale_static> getAll() {
        return saleStaticMapper.getAll() ;
    }
}
