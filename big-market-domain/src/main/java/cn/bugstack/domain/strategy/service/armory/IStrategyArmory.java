package cn.bugstack.domain.strategy.service.armory;

/**
 * @author: Xuyifeng
 * @date: 2024/12/23 19:26
 * @description: 策略装配工厂 负责初始化策略计算
 */

public interface IStrategyArmory {

    /**
     * 组装策略
     * 根据策略ID，将相关的策略组件或配置进行组装
     *
     * @param strategyId 策略ID，用于标识特定的策略
     */
    void assembleLotteryStrategy(Long strategyId);

}
