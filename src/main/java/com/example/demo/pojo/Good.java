package com.example.demo.pojo;

import lombok.Data;

/**
 * @Author spnooyseed
 * @Date 2021/1/2 22:07
 * @Version IDEA 2020.1
 */

@Data
// 商品类
public class Good {
   private Integer goodId ; // 商品编号
   private String goodName ; // 商品名称
   private String goodInformation ; // 商品信息
   private Integer goodSale ; // 商品销售量
   private Integer goodHave ; // 商品库存
   private  String goodType ; // 商品类型

    private static Integer initId = 1000 ;

    public Integer getGoodHave() {
        return goodHave;
    }
    public Integer getGoodId() {
        return goodId;
    }
    public Integer getGoodSale() {
        return goodSale;
    }
    public String getGoodInformation() {
        return goodInformation;
    }
    public String getGoodName() {
        return goodName;
    }
    public String getGoodType() {
        return goodType;
    }

    public void setGoodHave(Integer goodHave) {
        this.goodHave = goodHave;
    }
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }
    public void setGoodInformation(String goodInformation) {
        this.goodInformation = goodInformation;
    }
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
    public void setGoodSale(Integer goodSale) {
        this.goodSale = goodSale;
    }
}
