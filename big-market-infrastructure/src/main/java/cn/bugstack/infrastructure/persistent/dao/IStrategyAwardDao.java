package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Award;
import cn.bugstack.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/22 21:16
 * @description: 抽奖策略奖品明细配置DAO - 概率、规则
 */
@Mapper
public interface IStrategyAwardDao {

    // 查询奖品明细配置列表
    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);

    String queryStrategyAwardRuleModels(StrategyAward strategyAward);

    void updateStrategyAwardStock(StrategyAward strategyAward);
}
