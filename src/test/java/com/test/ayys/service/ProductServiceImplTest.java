package com.test.ayys.service;

import com.test.ayys.entity.ProductData;
import com.test.ayys.service.impl.ProductServiceImpl;

public class ProductServiceImplTest {

    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();
        ProductData data = productService.getList();
        System.out.println(data);
    }
}
