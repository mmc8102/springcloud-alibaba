package cn.mmc8102.order.web.controller;

import cn.mmc8102.common.domain.Order;
import cn.mmc8102.common.response.ApiResponse;
import cn.mmc8102.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangli
 * @Date: 2020/11/7 20:49
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/create/{pid}")
    public ApiResponse order(@PathVariable("pid") Integer pid) {
        log.info("接收到{}号商品的下单请求,接下来调用商品微服务查询此商品信息", pid);
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return new ApiResponse(orderService.add(pid));
    }

    @RequestMapping("message2")
    public String message2(){
        return "message2";
    }
}
