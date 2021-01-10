package com.example.demo.Controller;


import com.example.demo.DesignModel.Adapter.PassWordAdapter;
import com.example.demo.DesignModel.Instance.UserLoginInstance;
import com.example.demo.DesignModel.Instance.UserRegisterInstance;
import com.example.demo.pojo.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author spnooyseed
 * @Date 2021/1/3 23:22
 * @Version IDEA 2020.1
 */

@Controller
public class LogController {
  @RequestMapping("/")
  public String login() { return "main" ; }

  @RequestMapping("/toRegister")
  public String toRegister() { return "register" ; }

  @RequestMapping("/toLogin")
  public String toLogin() { return "login" ; }

  @Autowired
  private UserServiceImpl userServiceImpl ;

  private UserLoginInstance userLoginInstance = new UserLoginInstance();
  private PassWordAdapter passWordAdapter ;
  // 登录单例模式
  @PostMapping("/user/login")
  public String userLogin(User user , Model model , HttpSession session) {
    passWordAdapter = new PassWordAdapter(user) ;

    user.setPassword(passWordAdapter.passWordEncrytion());
    User user1 = userServiceImpl.loginByEmailAndPassword(user) ;

    System.out.println(user) ;
    System.out.println(user1);
    if(user1 != null) {
      user1 = userLoginInstance.getInstance(user1) ;
      session.setAttribute("loginUser" , user1 ) ;
      return "dashboard" ;
    }else {
      model.addAttribute("msg" , "密码或者账号输入错误") ;
      return "login" ;
    }
  }

  private UserRegisterInstance registerInstance = new UserRegisterInstance();
 // 注册单例模式
  @PostMapping("/user/register")
  public String userRegister(User user , Map<String , Object> map) {
        passWordAdapter = new PassWordAdapter(user) ;
        user.setPassword(passWordAdapter.passWordEncrytion()) ;
        user = registerInstance.getInstance(user) ;
        System.out.println(user);
        User user1 = userServiceImpl.loginByEmailAndPassword(user) ;
        if(user1 == null) {
          user.setActiveStatus(1) ;
          userServiceImpl.addUser(user) ;
        }
        return "login" ;
  }
  
  @RequestMapping("/emp/SignOut")
  public String SignOut(HttpSession session) {
    userLoginInstance.remove();
    session.removeAttribute("loginUser");
    return "main" ;
  }
}