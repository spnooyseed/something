package com.example.demo.DesignModel.Subject;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  13:18
 */
@Service
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>() ;

    @Autowired
    private  GoodsMapper goodsMapper ;

    public void setState(Good good) {
        this.goodsMapper.addGood(good) ;
        notifyAllObserver() ;
    }
    public void notifyAllObserver() {
        for(Observer observer : observers)
             observer.update();
    }
    public void attach(Observer observer) {
        observers.add(observer) ;
    }
}
