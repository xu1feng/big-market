package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Strategy;
import cn.bugstack.infrastructure.persistent.po.StrategyAward;
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

}
