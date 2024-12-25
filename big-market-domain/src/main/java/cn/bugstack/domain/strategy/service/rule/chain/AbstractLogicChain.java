package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @author: Xuyifeng
 * @date: 2024/12/25 19:14
 * @description: 抽奖策略责任链，判断走哪种抽奖策略。如；默认抽象、权重抽奖、黑名单抽奖
 */

public abstract class AbstractLogicChain implements ILogicChain{

    private ILogicChain next;

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    @Override
    public ILogicChain next() {
        return next;
    }

    protected abstract String ruleModel();

}
