package com.example.demo.DesignModel.Decide;

import com.example.demo.pojo.sale_static;
import com.example.demo.service.impl.SaleStaticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  5:31
 */
@Service
public class NameDecide implements Decide{
    @Autowired
    private SaleStaticServiceImpl saleStaticService ;
    @Override
    public List<sale_static> get() {
        List<sale_static> sale_statics = saleStaticService.getAll() ;
        // 以name为主体的统计
        return sale_statics;
    }
}
