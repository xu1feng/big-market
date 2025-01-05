package cn.bugstack.domain.rebate.service;

import cn.bugstack.domain.rebate.model.entity.BehaviorEntity;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2025/1/5 19:07
 * @description: 行为返利服务接口
 */

public interface IBehaviorRebateService {

    List<String> createOrder(BehaviorEntity behaviorEntity);

}
