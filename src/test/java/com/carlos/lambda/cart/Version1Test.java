package com.carlos.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Version1Test {

    @Test
    public void filterElectronicSkus(){

        List<Sku> cartSkuList = CartServcice.getCartSkuList();
        List<Sku> skus = CartServcice.filterElectronicsSkus(cartSkuList);

        System.out.println(JSON.toJSONString(skus, true));
    }
}
