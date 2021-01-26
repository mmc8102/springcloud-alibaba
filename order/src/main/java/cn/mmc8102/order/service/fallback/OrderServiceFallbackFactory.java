package cn.mmc8102.order.service.fallback;//package com.itheima.service.fallback;

import cn.mmc8102.common.domain.Order;
import cn.mmc8102.common.domain.Product;
import cn.mmc8102.common.exception.SystemException;
import cn.mmc8102.common.response.ApiResponseEnum;
import cn.mmc8102.order.service.IProductService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 这是容错类,他要求我们要是实现一个FallbackFactory<要为哪个接口产生容错类>
 */
@Slf4j
@Service
public class OrderServiceFallbackFactory {


    public static Order add(Integer pid) {
        return new Order();
    }
}
