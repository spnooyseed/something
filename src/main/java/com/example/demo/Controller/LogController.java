package com.example.demo.Controller;

import com.example.demo.pojo.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @Autowired
  private UserServiceImpl userServiceImpl ;

  @PostMapping("/user/login")
  public String userLogin(User user , Model model , HttpSession session) {
    User user1 = userServiceImpl.loginByEmailAndPassword(user) ;
    if(user1 != null) {
      session.setAttribute("loginUser" , user1 ) ;

      return "dashboard" ;
    }else {
      model.addAttribute("msg" , "密码或者账号输入错误") ;
      return "login" ;
    }
  }


  @PostMapping("/user/register")
  public String userRegister(User user , Map<String , Object> map) {
        user.setActiveStatus(1) ;
        userServiceImpl.addUser(user) ;
        return "login" ;
  }
}
