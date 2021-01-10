package com.example.demo.Controller;

import com.example.demo.DesignModel.Factory.Factory;
import com.example.demo.DesignModel.Factory.NameFactory;
import com.example.demo.DesignModel.Factory.TimeFactory;
import com.example.demo.DesignModel.Factory.TypeFactory;
import com.example.demo.pojo.sale_static;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author spnooyseed
 * Date on 2021/1/10  5:20
 */
@Controller
public class FactoryController {
    @Autowired
    private NameFactory nameFactory ;
    @Autowired
    private TypeFactory typeFactory ;
    @Autowired
    private TimeFactory timeFactory ;
    @RequestMapping("/ByTime")
    public String ByTime() {

        List<sale_static> list = timeFactory.get() ;
        System.out.println(list);
        return "emp/SaleStatic" ;
    }

    @RequestMapping("/ByType")
    public String ByType() {

        List<sale_static> list = typeFactory.get() ;
        System.out.println(list);
        return "emp/SaleStatic" ;

    }
    @RequestMapping("/ByName")
    public String ByName() {

        List<sale_static> list = nameFactory.get() ;
        System.out.println(list);
        return "emp/SaleStatic" ;
    }
}
