package cn.mmc8102.order.service;

import cn.mmc8102.common.domain.Order;
import cn.mmc8102.common.domain.Product;

/**
 * @author wangli
 * @Date: 2020/11/22 11:01
 * 订单相关服务
 */
public interface IOrderService {
    /**
     * 添加订单
     * @param pid
     */
    Order add(Integer pid);
}
