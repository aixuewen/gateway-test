package com.bonc.service.impl;

import com.bonc.dao.ProductDao;
import com.bonc.domain.Product;
import com.bonc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
         return productDao.findById(pid).get();
    }
}
