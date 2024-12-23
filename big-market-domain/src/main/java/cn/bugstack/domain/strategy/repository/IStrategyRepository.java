package cn.bugstack.domain.strategy.repository;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/23 19:29
 * @description: 策略仓储接口
 */

public interface IStrategyRepository {

    /**
     * 查询指定策略的奖励列表
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @return 返回一个StrategyAwardEntity对象列表，包含指定策略的奖励信息
     */
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    /**
     * 存储策略奖励搜索比率表
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @param rateRange 比率范围，用于定义搜索的范围
     * @param shuffleStrategyAwardSearchRateTables 一个HashMap，键为比率键，值为搜索比率，用于存储搜索比率表
     */
    void storeStrategyAwardSearchRateTables(Long strategyId, Integer rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    /**
     * 获取指定策略的比率范围
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @return 返回一个整数，表示指定策略的比率范围
     */
    int getRateRange(Long strategyId);

    /**
     * 根据比率键获取策略奖励组装信息
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @param rateKey 比率键，用于获取特定的奖励组装信息
     * @return 返回一个整数，表示根据比率键获取的策略奖励组装信息
     */
    Integer getStrategyAwardAssemble(Long strategyId, int rateKey);

}
