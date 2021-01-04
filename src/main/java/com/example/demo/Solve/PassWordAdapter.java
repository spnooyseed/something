package com.example.demo.Solve;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  14:59
 */

public class PassWordAdapter implements PassWordTaget{

    private String userName , userEmail , userpassword ;
    public PassWordAdapter(String userName , String userEmail , String userPassword) {
        this.userEmail = userEmail ;
        this.userName = userName ;
        this.userpassword = userPassword ;
    }

    @Override
    public String getPassWord() {
        return this.userpassword ;
    }

    @Override
    public void passWordEncryption() {

    }
}
