package cn.bugstack.domain.strategy.service;

import java.util.Map;

/**
 * @author: Xuyifeng
 * @date: 2025/1/4 20:04
 * @description: 抽奖规则接口
 */

public interface IRaffleRule {

    Map<String, Integer> queryAwardRuleLockCount(String[] treeIds);

}
