package com.carlos.lambda.cart;

/**
 * 下单商品信息
 */
public class Sku {
    //编号
    private Integer skuId;
    //商品名称
    private String skuName;
    //单价
    private Double skuPrice;
    //购买个数
    private Integer totalNum;
    //总价
    private Double totalPrice;
    //商品类型
    private Enum skuCategory;

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer totalNum, Double totalPrice, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.totalNum = totalNum;
        this.totalPrice = totalPrice;
        this.skuCategory = skuCategory;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Enum getSkuCategory() {
        return skuCategory;
    }
}
