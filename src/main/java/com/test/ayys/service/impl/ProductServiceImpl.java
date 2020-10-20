package com.test.ayys.service.impl;

import com.test.ayys.dao.FilmDao;
import com.test.ayys.dao.impl.FilmDaoImpl;
import com.test.ayys.entity.ProductData;
import com.test.ayys.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private final FilmDao filmDao = new FilmDaoImpl();

    /**
     * 获取所有数据
     * @return 数据集合
     */
    @Override
    public ProductData getList() {
        ProductData data = new ProductData();
        data.setList(filmDao.selectList());
        return data;
    }
}
