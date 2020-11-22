package cn.mmc8102.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品
 * @author 16282
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;

    private String name;
    private Double price;
    private Integer stock;
}