package cn.bugstack.domain.activity.service.armory;

/**
 * @author: Xuyifeng
 * @date: 2025/1/2 17:12
 * @description: 活动装配预热
 */

public interface IActivityArmory {

    boolean assembleActivitySkuByActivityId(Long activityId);

    boolean assembleActivitySku(Long sku);

}
