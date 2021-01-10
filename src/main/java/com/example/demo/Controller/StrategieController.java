package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author spnooyseed
 * Date on 2021/1/9  14:15
 */

@Controller
public class StrategieController {
    private static Integer totalRecords , pageSize = 2 , pageCount , currentPage ;

    @Autowired
    private GoodServiceImpl goodService ;
    @RequestMapping("/emps/getAll")
    public String getAll(HttpServletRequest request , Model model) {
        String goodType = request.getParameter("goodT");
        System.out.println("goodType = " + goodType);
        if(goodType == null) goodType = "1" ;
        if(goodType.compareTo("1") == 0) totalRecords = goodService.queryTotal() ;
        else totalRecords = goodService.queryTotalRecords(goodType) ;
        pageCount = (totalRecords + pageSize - 1) / pageSize ;
        System.out.println("gppdType = " + goodType);
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
        System.out.println("total = " + totalRecords + " start " + map.get("start") + " pages " + map.get("pages"));
        List<Good> goodList = goodService.queryLimitAccounts((currentPage - 1) * pageSize ,pageSize, goodType) ;
        System.out.println(goodList);
        model.addAttribute("Type" , goodType) ;
        model.addAttribute("emps" , goodList) ;
        model.addAttribute("pageSize" , pageSize) ;
        model.addAttribute("pageCount" , pageCount) ;
        model.addAttribute("currentPage" , currentPage) ;
        model.addAttribute("totalRecords" , totalRecords) ;
        return "emp/list";
    }
}