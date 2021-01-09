package com.example.demo.Controller;

import com.example.demo.pojo.Good;
import com.example.demo.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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
        model.addAttribute(strings) ;
        return strings ;
    }

    @ResponseBody
    @PutMapping("/emps/list_HaveStatic")
    public Object list_HaveStatic(@RequestParam("goodType_ajax") String goodType ,
                                  @RequestParam("goodName_ajax") String goodName) {
        List<Good> goodList = goodService.getAllGoodByGoodTypeAndGoodName(goodType , goodName) ;
        return goodList ;
    }
}