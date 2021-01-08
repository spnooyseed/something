package com.example.demo.DesignModel;

import com.example.demo.pojo.User;

/**
 * @Author spnooyseed
 * Date on 2021/1/8  14:08
 */

public class UserRegisterInstance {
    private static User user = null ;
    public User getInstance(User user1) {
        if(user == null) this.user = user1 ;
        return user ;
    }
}
