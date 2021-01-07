package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/5  15:19
 */
@Controller

public class AjaxController {
    @Autowired
    private GoodServiceImpl goodService ;

    @RequestMapping("/getAllGoodNameBygoodType")
    @ResponseBody
    public Object addComInfo(Model model , String goodType) {
        List<String> strings = goodService.getAllgoodNameByType(goodType) ;
        System.out.println("123");
        model.addAttribute(strings) ;
        return strings ;
    }
}
