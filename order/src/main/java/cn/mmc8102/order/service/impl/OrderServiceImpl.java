package cn.mmc8102.order.service.impl;

import cn.mmc8102.common.domain.Product;
import cn.mmc8102.common.exception.SystemException;
import cn.mmc8102.common.response.ApiResponseEnum;
import cn.mmc8102.order.service.IOrderService;
import cn.mmc8102.order.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangli
 * @Date: 2020/11/22 11:01
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IProductService productService;


    @Override
    public Product add(Integer pid) {
        Product product = productService.get(pid);
        if(product == null){
            throw new SystemException(ApiResponseEnum.PARAM_EXCEPTION, new Object[]{"商品不存在"});
        }
        return product;
    }
}
