package cn.mmc8102.order.service.impl;

import cn.mmc8102.common.domain.Order;
import cn.mmc8102.common.domain.Product;
import cn.mmc8102.common.exception.SystemException;
import cn.mmc8102.common.response.ApiResponseEnum;
import cn.mmc8102.order.service.IOrderService;
import cn.mmc8102.order.service.IProductService;
import cn.mmc8102.order.service.fallback.OrderServiceFallbackFactory;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
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
    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    @Override
    @SentinelResource(value = "order-add", fallbackClass = OrderServiceFallbackFactory.class)
    public Order add(Integer pid) {
        int i = 1/0;
        Product product = productService.get(pid);
        if(product == null){
            throw new SystemException(ApiResponseEnum.PARAM_EXCEPTION, new Object[]{"商品不存在"});
        }
        Order order = Order.builder().id(1L).product(product).number(1).uid(1).build();
        //发送mq
        //rocketMQTemplate.convertAndSend("order-topic", order);
        return order;
    }
}
