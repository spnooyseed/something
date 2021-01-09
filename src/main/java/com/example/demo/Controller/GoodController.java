package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  22:22
 */

@Controller
public class GoodController {

    private static Integer totalRecords , pageSize = 10 , pageCount , currentPage ;
    @Autowired
    private GoodServiceImpl goodService ;

    @RequestMapping("/emps/Office")
    public String OfficeGood(Model model) {
        List<Good> goodList = goodService.getAllOfficeGood() ;
        model.addAttribute("emps" , goodList) ;
        return "emp/list_Office";
    }

    @RequestMapping("/emps/DayUse")
    public String DayUseGood(HttpServletRequest request, Model model) {
        String DayUse = "DayUse";
        totalRecords = goodService.queryTotalRecords(DayUse) ;
        pageCount = (totalRecords + pageSize - 1) / pageSize ;
        String strCurrentPage = (String)request.getParameter("pageNum")  ;
        if(strCurrentPage == null) {
            currentPage = 1 ;
        }else {
            currentPage = Integer.parseInt(strCurrentPage) ;
            if(currentPage >= pageCount) currentPage = pageCount ;
            if(currentPage < 1) currentPage = 1 ;
        }
        Map<String , Integer> map = new HashMap<>() ;
        map.put("start" , (currentPage - 1) * pageSize) ;
        map.put("pages" , pageSize) ;
        List<Good> goodList = goodService.queryLimitAccounts((currentPage - 1) * pageSize ,pageSize, DayUse) ;
        model.addAttribute("emps" , goodList) ;
        model.addAttribute("pageSize" , pageSize) ;
        model.addAttribute("pageCount" , pageCount) ;
        model.addAttribute("currentPage" , currentPage) ;
        model.addAttribute("totalRecords" , totalRecords) ;
        return "emp/list_DayUse";
    }

    @RequestMapping("/emps/Food")
    public String Food(Model model) {
        List<Good> goodList = goodService.getAllFood() ;
        model.addAttribute("emps" , goodList) ;
        return "emp/list_Food";
    }
    @RequestMapping("/emps/Drink")
    public String Drink(Model model) {
        List<Good> goodList = goodService.getAllDrink() ;
        model.addAttribute("emps" , goodList) ;
        return "emp/list_Drink";
    }

    @RequestMapping("/emps/addGood")
    public String toaddGood(Model model) {
        List<String> strings = goodService.getAllgoodType() ;
        model.addAttribute("emps" , strings) ;
        return "emp/add" ;
    }

    @PostMapping("/emp/addGood")
    public String addGood(Good good) { goodService.addGood(good) ;return "emp/add" ; }

    @RequestMapping("/emps/HaveStatic")
    public String toHaveStatic(Model model) {
         List<String> goodStrings =  goodService.getAllgoodType() ;
         model.addAttribute("Types" , goodStrings) ;
         List<Good> goodList = goodService.getAll() ;
         model.addAttribute("emps" , goodList) ;
         return "emp/HaveStatic" ;
    }

}