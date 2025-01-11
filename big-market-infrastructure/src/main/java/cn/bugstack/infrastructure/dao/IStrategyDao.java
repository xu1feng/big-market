package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/22 21:16
 * @description: 抽奖策略DAO
 */
@Mapper
public interface IStrategyDao {

    // 查询抽奖策略列表
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
