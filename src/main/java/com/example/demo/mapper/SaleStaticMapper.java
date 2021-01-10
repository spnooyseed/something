package com.example.demo.mapper;

import com.example.demo.pojo.Good;
import com.example.demo.pojo.sale_static;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/9  16:34
 */
@Mapper
@Repository
public interface SaleStaticMapper {
    public List<sale_static> getAll() ;
}
