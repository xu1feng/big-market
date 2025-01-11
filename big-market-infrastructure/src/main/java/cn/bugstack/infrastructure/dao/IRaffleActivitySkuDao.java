package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.RaffleActivitySku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/29 21:22
 * @description: 商品sku dao操作
 */
@Mapper
public interface IRaffleActivitySkuDao {

    RaffleActivitySku queryActivitySku(Long sku);

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

    List<RaffleActivitySku> queryActivitySkuListByActivityId(Long activityId);

}
