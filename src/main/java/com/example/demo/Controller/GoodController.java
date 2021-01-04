package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/4  22:22
 */

@Controller
public class GoodController {

    @Autowired
    private GoodServiceImpl goodService ;

    @RequestMapping("/emps/Office")
    public String OfficeGood(Model model) {
        List<Good> goodList = goodService.getAllOfficeGood() ;
        model.addAttribute("emps" , goodList) ;
        return "emp/list_Office";
    }

    @RequestMapping("/emps/DayUse")
    public String DayUseGood(Model model) {
        List<Good> goodList = goodService.getAllDayUse() ;
        model.addAttribute("emps" , goodList) ;
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
}