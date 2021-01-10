package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.pojo.sale_static;
import com.example.demo.service.impl.GoodServiceImpl;
import com.example.demo.service.impl.SaleStaticServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  22:22
 */

@Controller
public class GoodController {

    private static Integer totalRecords , pageSize = 2 , pageCount , currentPage ;
    @Autowired
    private GoodServiceImpl goodService ;

    @RequestMapping("/emps/addGood")
    public String toaddGood(Model model) {
        List<String> strings = goodService.getAllgoodType() ;
        model.addAttribute("emps" , strings) ;
        return "emp/add" ;
    }

    @PostMapping("/emp/addGood")
    public String addGood(Good good) {
        goodService.addGood(good) ;
        return "emp/add" ;
    }

    @RequestMapping("/emps/HaveStatic")
    public String toHaveStatic(Model model) {
         List<String> goodStrings =  goodService.getAllgoodType() ;
         model.addAttribute("Types" , goodStrings) ;
         List<Good> goodList = goodService.getAll() ;
         model.addAttribute("emps" , goodList) ;
         return "emp/HaveStatic" ;
    }

    @RequestMapping("/emps/SaleStatic")

    public String toSaleStatic(Model model) {
        return "emp/SaleStatic" ;
    }
}