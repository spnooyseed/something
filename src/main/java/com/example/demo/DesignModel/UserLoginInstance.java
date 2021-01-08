package com.example.demo.DesignModel;

import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author spnooyseed
 * Date on 2021/1/8  13:47
 */
// 登录单例模式
public class UserLoginInstance {

    private static User user = null ;
    public User getInstance(User user1) {
        if(user == null) this.user = user1 ;
        return this.user ;
    }
    public  void remove() {
        if(user != null) this.user = null ;
    }

}
