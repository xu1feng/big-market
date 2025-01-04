package cn.bugstack.domain.strategy.service;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/28 16:53
 * @description: 策略奖品接口
 */

public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param activityId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardListByActivityId(Long activityId);

}
