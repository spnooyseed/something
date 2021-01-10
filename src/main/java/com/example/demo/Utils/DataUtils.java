package com.example.demo.Utils;

import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author spnooyseed
 * Date on 2021/1/9  16:26
 */
@Controller
public class DataUtils {

    public Date getData() throws ParseException{
        Date date = new Date() ;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd") ;
        String formatDate = format.format(date) ;
        Date parse = format.parse(formatDate) ;
        return parse ;
    }
}
