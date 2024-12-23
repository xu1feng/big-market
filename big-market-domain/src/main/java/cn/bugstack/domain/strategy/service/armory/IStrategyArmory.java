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

    /**
     * 获取随机奖项ID
     * 根据策略ID，按照既定的规则或算法，从奖项池中选取一个随机奖项
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @return 返回随机选取的奖项ID
     */
    Integer getRandomAwardId(Long strategyId);

}
