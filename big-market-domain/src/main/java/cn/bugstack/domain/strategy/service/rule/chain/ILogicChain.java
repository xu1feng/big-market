package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @author: Xuyifeng
 * @date: 2024/12/25 19:10
 * @description: 责任链接口
 */

public interface ILogicChain extends ILogicChainArmory{

    /**
     * 责任链接口
     *
     * @param userId 用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    Integer logic(String userId, Long strategyId);

}
