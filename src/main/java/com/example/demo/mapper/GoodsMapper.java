package com.example.demo.mapper;

import com.example.demo.pojo.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * @Date 2021/1/2 22:21
 * @Version IDEA 2020.1
 */
@Mapper
@Repository

public interface GoodsMapper {
   List<Good> getAllOfficeGood() ;
   List<Good> getAllDayUse() ;
   List<Good> getAllFood() ;
   List<Good> getAllDrink() ;
   List<Good> getAll() ;
   List<String> getAllgoodType() ;
   void addGood(Good good) ;
   List<Good> getAllgoodByType(String goodType) ;
   List<String> getAllgoodNameByType(String goodType) ;
   List<Good> getAllGoodByGoodTypeAndGoodName(String goodType , String goodName) ;
   Integer queryTotalRecords(String Type);
   List<Good> queryLimitAccounts(Integer start , Integer pages, String Type);
   List<Good> queryLimitAllAccounts(Integer start , Integer pages);
   List<Integer> getGoodIdByName(String goodName) ;
   Integer queryTotal();
   List<String> getAllName() ;
}