package cn.mmc812.user.service;

import cn.mmc8102.common.domain.Order;
import cn.mmc8102.common.util.JsonTool;
import cn.mmc812.user.service.SmsService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author wangli
 * @Date: 2021/1/24 11:42
 */
@Service
@Slf4j
@RocketMQMessageListener(consumerGroup = "shop-user", topic = "order-topic")
public class SmsService implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        log.info("收到一个订单信息{},接下来发送短信", JsonTool.toJson(order));
    }
}
