package com.example.demo.Controller;

import com.example.demo.pojo.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author spnooyseed
 * @Date 2021/1/3 23:22
 * @Version IDEA 2020.1
 */
@Controller
public class LogController {
  @RequestMapping("/")
    public String login() {
      return "main" ;
  }

  @RequestMapping("/toRegister")
  public String toRegister() {
    return "register" ;
  }

  @RequestMapping("/toLogin")
  public String toLogin() {
    return "login" ;
  }
  @PostMapping("/user/login")
  public String userLogin() {
    return "register" ;
  }

  @Autowired
  private UserServiceImpl userServiceImpl ;

  @PostMapping("/user/register")
  public String userRegister(User user , Map<String , Object> map) {
        user.setActiveStatus(1) ;
        userServiceImpl.addUser(user) ;
        return "login" ;
//      System.out.println(password + " " + checkpassword) ;
//      if(password.compareTo(checkpassword) != 0) {
//        map.put("msg" , "两次密码不一致")  ;
//        return  "register" ;
//      }
//      usersServiceImpl.addUser(new User(username , email , password)) ;
//      map.put("msg" , "注册成功") ;
//      return "login" ;
  }
}
