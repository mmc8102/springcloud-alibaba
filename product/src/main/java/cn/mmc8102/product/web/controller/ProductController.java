package cn.mmc8102.product.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangli
 * @Date: 2020/11/7 20:49
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("get")
    public String message(){

        return "product demo";
    }

}
