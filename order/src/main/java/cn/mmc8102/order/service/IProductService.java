package cn.mmc8102.order.service;

import cn.mmc8102.common.domain.Product;
import cn.mmc8102.common.response.ApiResponse;
import cn.mmc8102.order.service.fallback.ProductServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangli
 * @Date: 2020/11/22 11:02
 * 商品相关服务
 */

@FeignClient(value = "service-product", fallbackFactory = ProductServiceFallbackFactory.class)
public interface IProductService {
    @RequestMapping("/product/get/{pid}")
    ApiResponse<Product> get(@PathVariable Integer pid);
}
