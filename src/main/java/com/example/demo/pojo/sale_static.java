package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author spnooyseed
 * Date on 2021/1/9  16:31
 */
@Data
public class sale_static {
    private Integer goodId ;
    private Date saleTime ;
    private Integer num ;
    private String goodName ;
    public Date getSaleTime() {
        return saleTime;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public Integer getNum() {
        return num;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }
}
