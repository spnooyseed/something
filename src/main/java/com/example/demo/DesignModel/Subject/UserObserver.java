package com.example.demo.DesignModel.Subject;

import org.springframework.stereotype.Service;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  13:35
 */
@Service
public class UserObserver extends Observer{

    public UserObserver(Subject subject) {
        this.subject = subject ;
        this.subject.attach(this) ;
    }
    @Override
    public void update() {
        System.out.println("我是一名正在访问这个商品的人，我被通知到了") ;
    }
}
