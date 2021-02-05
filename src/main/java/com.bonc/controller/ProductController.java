package com.bonc.controller;

import com.alibaba.fastjson.JSON;
import com.bonc.domain.Product;
import com.bonc.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/add/{pid}")
    public Product GetMapping(@PathVariable("pid") Integer pid){
        log.info("add {}",pid);
        Product product = productService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSON(product));
        return product;
    }

    @PostMapping("/product/update")
    public Product PostMapping(@RequestBody Integer pid){
        log.info("update {}",pid);
        Product product = productService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSON(product));
        return product;
    }
    @PutMapping  ("/product/put")
    public Product PutMapping(@RequestBody Integer pid){
        log.info("delete {}",pid);
        Product product = productService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSON(product));
        return product;
    }
    @DeleteMapping("/product/delete")
    public Product DeleteMapping(@RequestBody Integer pid){
        log.info("delete {}",pid);
        Product product = productService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSON(product));
        return product;
    }
}
