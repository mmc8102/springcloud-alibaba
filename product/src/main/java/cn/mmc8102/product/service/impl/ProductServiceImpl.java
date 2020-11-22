package cn.mmc8102.product.service.impl;

import cn.mmc8102.common.domain.Product;
import cn.mmc8102.product.mapper.ProductMapper;
import cn.mmc8102.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findByPid(Integer pid) {
        return productMapper.getById(pid);
    }

    @Transactional
    @Override
    public void reduceInventory(Integer pid, Integer number) {
        //查询
        Product product = productMapper.getById(pid);
        //省略校验

        //内存中扣减
        product.setStock(product.getStock() - number);

        //模拟异常
        //int i = 1 / 0;

        //保存
        productMapper.save(product);
    }


}
