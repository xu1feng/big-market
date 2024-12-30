package cn.bugstack.domain.activity.service.rule;

/**
 * @author: Xuyifeng
 * @date: 2024/12/30 20:03
 * @description: 抽奖动作责任链装配
 */

public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
