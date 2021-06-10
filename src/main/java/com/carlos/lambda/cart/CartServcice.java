package com.carlos.lambda.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务类
 */
public class CartServcice {

    private static List<Sku> cartSkuList = new ArrayList<Sku>(){
        {
            add(new Sku(1, "无人机", 4900.00, 1, 4900.00, SkuCategoryEnum.ELECTRONICS));
            add(new Sku(2, "VR一体机", 2299.00, 1, 2299.00, SkuCategoryEnum.ELECTRONICS));
            add(new Sku(3, "纯色衬衫", 409.00, 3, 1227.00, SkuCategoryEnum.CLOTHING));
            add(new Sku(4, "牛仔裤", 528.00, 1, 528.00, SkuCategoryEnum.CLOTHING));
            add(new Sku(5, "跑步机", 2699.00, 1, 2699.00, SkuCategoryEnum.SPORTS));
            add(new Sku(6, "Java编程思想", 79.80, 1, 79.80, SkuCategoryEnum.BOOKS));
            add(new Sku(6, "Java核心技术", 149.80, 1, 149.80, SkuCategoryEnum.BOOKS));

        }
    };

    /**
     * 返回商品列表
     * @return
     */
    public static List<Sku> getCartSkuList() {
        return cartSkuList;
    }

    /**
     * vsersion 1.0.0
     * find all electronic products
     * @param cartSkuList
     * @return
     */
     public static List<Sku>  filterElectronicsSkus(List<Sku> cartSkuList){

        List<Sku> result = new ArrayList<>();
         for (Sku sku : cartSkuList) {

             if(sku.getSkuCategory().
                     equals(SkuCategoryEnum.ELECTRONICS)){
                 result.add(sku);
             }
         }
         return result;

     }

}
