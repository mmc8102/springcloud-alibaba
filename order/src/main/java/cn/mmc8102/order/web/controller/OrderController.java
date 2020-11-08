package cn.mmc8102.order.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangli
 * @Date: 2020/11/7 20:49
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("message")
    public String message(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "message";
    }

    @RequestMapping("message2")
    public String message2(){
        return "message2";
    }
}
