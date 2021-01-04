package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author spnooyseed
 * @Date 2021/1/2 22:21
 * @Version IDEA 2020.1
 */

@Mapper
@Repository

public interface UserMapper {
//   增加用户
    int addUser(User user) ;

    //根据账号密码登录
    User loginByEmailAndPassword(User user);
}
