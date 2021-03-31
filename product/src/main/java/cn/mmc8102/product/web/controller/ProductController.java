package cn.mmc8102.product.web.controller;

import cn.mmc8102.common.domain.Product;
import cn.mmc8102.common.response.ApiResponse;
import cn.mmc8102.common.response.ApiResponseEnum;
import cn.mmc8102.common.util.JsonTool;
import cn.mmc8102.product.service.IProductService;
import com.alibaba.fastjson.JSON;
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
@RequestMapping("/product")
@Slf4j
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     * 商品信息查询
     * @param pid
     * @return
     */
    @RequestMapping("/get/{pid}")
    public ApiResponse product(@PathVariable("pid") Integer pid) {
        log.info("接下来要进行{}号商品信息的查询", pid);
        Product product = productService.findByPid(pid);
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //int i = 1/0;
        log.info("商品信息查询成功,内容为{}", JsonTool.toJson(product));
        return new ApiResponse(ApiResponseEnum.ERROR);
    }

}
