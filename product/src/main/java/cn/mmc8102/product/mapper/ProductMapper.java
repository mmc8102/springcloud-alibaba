package cn.mmc8102.product.mapper;

import cn.mmc8102.common.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author wangli
 * @Date: 2020/11/22 11:12
 */
public interface ProductMapper {

    @Select("select * from product where id = #{pid}")
    Product getById(Integer pid);

    @Insert("insert into product(name, price, stock) values(#{name}, #{price}, #{stock})")
    void save(Product product);
}
