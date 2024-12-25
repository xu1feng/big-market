package cn.bugstack.domain.strategy.service.rule.tree;

import cn.bugstack.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author: Xuyifeng
 * @date: 2024/12/25 20:49
 * @description: 规则树接口
 */

public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId);

}
