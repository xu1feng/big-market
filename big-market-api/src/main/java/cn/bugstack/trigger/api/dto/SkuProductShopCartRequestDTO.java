package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @author: Xuyifeng
 * @date: 2025/1/10 9:30
 * @description: 商品购物车请求对象
 */
@Data
public class SkuProductShopCartRequestDTO {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * sku 商品
     */
    private Long sku;

}
