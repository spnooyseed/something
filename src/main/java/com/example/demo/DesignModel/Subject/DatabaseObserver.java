package com.example.demo.DesignModel.Subject;

import com.example.demo.mapper.GoodsMapper;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  13:19
 */
@Service
public class DatabaseObserver extends Observer {

    public DatabaseObserver(Subject subject) {
        this.subject = subject ;
        this.subject.attach(this) ;
    }

    @Override
    public void update() {
         System.out.println("收到通知： 数据库里面添加了商品");
    }
}
