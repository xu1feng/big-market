package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @author: Xuyifeng
 * @date: 2024/12/25 19:42
 * @description: 责任链装配接口
 */

public interface ILogicChainArmory {

    ILogicChain appendNext(ILogicChain next);

    ILogicChain next();

}
