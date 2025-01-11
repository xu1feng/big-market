package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/22 21:16
 * @description: 抽奖策略奖品明细配置DAO - 概率、规则
 */
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);

    String queryStrategyAwardRuleModels(StrategyAward strategyAward);

    void updateStrategyAwardStock(StrategyAward strategyAward);

    StrategyAward queryStrategyAward(StrategyAward strategyAwardReq);

}
