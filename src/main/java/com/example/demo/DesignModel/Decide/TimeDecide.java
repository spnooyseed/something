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
public class TimeDecide implements Decide{
    @Autowired
    private SaleStaticServiceImpl saleStaticService ;
    @Override
    public List<sale_static> get() {
        List<sale_static> sale_statics = saleStaticService.getAll() ;
        // 以time为主体的统计
        for(int i = 0 ;i < sale_statics.size() ;i ++ )
             for(int j = 0 ;j < sale_statics.size() ;j ++ )
                  if(sale_statics.get(i).getSaleTime().compareTo(sale_statics.get(i).getSaleTime()) > 0){
                      sale_static temp = sale_statics.get(i) ;
                      sale_statics.set(i, sale_statics.get(j));
                      sale_statics.set(j , temp) ;
                  }
        return sale_statics;
    }
}
