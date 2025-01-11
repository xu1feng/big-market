package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/22 21:16
 * @description: 策略规则DAO
 */
@Mapper
public interface IStrategyRuleDao {

    // 查询策略规则列表
    List<StrategyRule> queryStrategyRuleList();

    StrategyRule queryStrategyRule(StrategyRule strategyRuleReq);

    String queryStrategyRuleValue(StrategyRule strategyRule);
}
