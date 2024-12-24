package cn.bugstack.domain.strategy.service.armory;

/**
 * @author: Xuyifeng
 * @date: 2024/12/23 21:28
 * @description: 策略抽奖的调度
 */

public interface IStrategyDispatch {

    /**
     * 获取随机奖项ID
     * 根据策略ID，按照既定的规则或算法，从奖项池中选取一个随机奖项
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @return 返回随机选取的奖项ID
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

}
