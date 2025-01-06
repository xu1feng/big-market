package cn.bugstack.domain.rebate.service;

import cn.bugstack.domain.rebate.model.entity.BehaviorEntity;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2025/1/5 19:07
 * @description: 行为返利服务接口
 */

public interface IBehaviorRebateService {

    /**
     * 创建行为动作的入账订单
     *
     * @param behaviorEntity 行为实体对象
     * @return 订单ID
     */
    List<String> createOrder(BehaviorEntity behaviorEntity);

}
