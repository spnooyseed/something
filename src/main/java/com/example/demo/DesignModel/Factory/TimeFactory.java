package com.example.demo.DesignModel.Factory;

import com.example.demo.DesignModel.Decide.Decide;
import com.example.demo.DesignModel.Decide.NameDecide;
import com.example.demo.DesignModel.Decide.TimeDecide;
import com.example.demo.mapper.SaleStaticMapper;
import com.example.demo.pojo.sale_static;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  5:33
 */
@Service
public class TimeFactory implements Factory{

    @Autowired
    private TimeDecide decide ;
    @Override
    public List<sale_static> get() {
        return decide.get();
    }
}
