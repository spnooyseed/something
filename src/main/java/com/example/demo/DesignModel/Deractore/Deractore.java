package com.example.demo.DesignModel.Deractore;

import com.example.demo.pojo.Good;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  2:13
 */
@Service
public interface Deractore {
    List<Good> getAll(Integer start , Integer pages, String Type) ;
}
