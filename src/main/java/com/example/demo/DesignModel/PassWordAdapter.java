package com.example.demo.DesignModel;

import com.example.demo.pojo.User;

/**
 * @Author spnooyseed
 * Date on 2021/1/8  13:55
 */
// 加密适配器
public class PassWordAdapter implements PassWordTaget{
    private User user = null ;
    public PassWordAdapter(User user1) {
        this.user = user1 ;
    }

    @Override
    public String getPassWord() {
        return user.getPassword();
    }

    @Override
    public String passWordEncrytion() {
        MD5 md5 = new MD5() ;
        return md5.md5(getPassWord());
    }

}
