package cn.mmc8102.order.service;

import cn.mmc8102.common.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangli
 * @Date: 2020/11/22 11:02
 * 商品相关服务
 */
@FeignClient("service-product")
public interface IProductService {
    @RequestMapping("/product/get/{pid}")
    Product get(@PathVariable Integer pid);
}
