package cn.mmc8102.order.service.fallback;//package com.itheima.service.fallback;

import cn.mmc8102.common.domain.Product;
import cn.mmc8102.order.service.IProductService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 这是容错类,他要求我们要是实现一个FallbackFactory<要为哪个接口产生容错类>
 */
@Slf4j
@Service
public class ProductServiceFallbackFactory implements FallbackFactory<IProductService> {


    @Override
    public IProductService create(Throwable throwable) {
        //Throwable  这就是fegin在调用过程中产生异常
        return new IProductService() {
            @Override
            public Product get(Integer pid) {
                log.error("product exception {}",throwable);
                Product product = new Product();
                return product;
            }
        };
    }
}
