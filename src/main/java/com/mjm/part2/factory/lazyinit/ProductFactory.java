package com.mjm.part2.factory.lazyinit;

import java.util.HashMap;

/**
 * @author majun
 * @date 2018/10/23 20:34
 */
public class ProductFactory {

    public static HashMap<String, Product> productHashMap = new HashMap<>();

    public static synchronized Product createProduct(String type){
        Product product = null;
        //如果Map中 已经有这个对象
        if (productHashMap.containsKey(type)){
            return productHashMap.get(type);
        }else{
            if ("product1".equals(type)){
                product = new Product1();
            } else if("product1".equals(type)){
                product = new Product2();
            }
            productHashMap.put(type, product);
        }
        return product;
    }
}
