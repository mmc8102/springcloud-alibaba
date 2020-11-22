package cn.mmc8102.product.service;

import cn.mmc8102.common.domain.Product;

/**
 * @author 16282
 * 商品相关服务
 */
public interface IProductService {

    /**
     * 根据pid查询商品信息
     * @param pid
     * @return
     */
    Product findByPid(Integer pid);

    /**
     * 扣减库存
     * @param pid
     * @param number
     */
    void reduceInventory(Integer pid, Integer number);
}
