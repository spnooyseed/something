package com.example.demo.pojo;

import lombok.Data;

/**
 * @Author spnooyseed
 * @Date 2021/1/2 22:06
 * @Version IDEA 2020.1
 */
@Data
// 用户类
public class User {
    private Integer userId ; // 用户编号
    private String userName ; // 用户名
    private String password ; // 用户密码
    private String email ; // 用户邮箱
    private int activeStatus ;
    private int role ; // 用户权限

    public void setActiveStatus(int activeStatus) { this.activeStatus = activeStatus; }

    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    public void setRole(int role) { this.role = role; }

    public void setUserId(Integer userId) { this.userId = userId; }

    public void setUserName(String userName) { this.userName = userName; }

    public String getEmail() { return email; }

    public Integer getUserId() { return userId; }

    public String getUserName() { return userName; }

    public int getActiveStatus() { return activeStatus; }

    public int getRole() { return role; }

    public String getPassword() { return password; }

}
