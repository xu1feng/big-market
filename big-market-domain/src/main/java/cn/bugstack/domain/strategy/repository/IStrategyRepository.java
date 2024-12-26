package cn.bugstack.domain.strategy.repository;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;
import cn.bugstack.domain.strategy.model.entity.StrategyEntity;
import cn.bugstack.domain.strategy.model.entity.StrategyRuleEntity;
import cn.bugstack.domain.strategy.model.valobj.RuleTreeVO;
import cn.bugstack.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import cn.bugstack.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

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
     * @param key 策略ID，用于标识特定的策略
     * @param rateRange 比率范围，用于定义搜索的范围
     * @param shuffleStrategyAwardSearchRateTables 一个HashMap，键为比率键，值为搜索比率，用于存储搜索比率表
     */
    void storeStrategyAwardSearchRateTables(String key, Integer rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    /**
     * 获取指定策略的比率范围
     *
     * @param strategyId 策略ID，用于标识特定的策略
     * @return 返回一个整数，表示指定策略的比率范围
     */
    int getRateRange(Long strategyId);

    int getRateRange(String key);

    /**
     * 根据比率键获取策略奖励组装信息
     *
     * @param key 策略ID，用于标识特定的策略
     * @param rateKey 比率键，用于获取特定的奖励组装信息
     * @return 返回一个整数，表示根据比率键获取的策略奖励组装信息
     */
    Integer getStrategyAwardAssemble(String key, int rateKey);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    /**
     * 根据规则树ID，查询树结构信息
     *
     * @param treeId 规则树ID
     * @return 树结构信息
     */
    RuleTreeVO queryRuleTreeVOByTreeId(String treeId);

    /**
     * 缓存奖品库存
     *
     * @param cacheKey   key
     * @param awardCount 库存值
     */
    void cacheStrategyAwardCount(String cacheKey, Integer awardCount);

    /**
     * 缓存key，decr 方式扣减库存
     *
     * @param cacheKey 缓存Key
     * @return 扣减结果
     */
    Boolean subtractionAwardStock(String cacheKey);

    void awardStockConsumeSendQueue(StrategyAwardStockKeyVO strategyAwardStockKeyVO);

    StrategyAwardStockKeyVO takeQueueValue();

    void updateStrategyAwardStock(Long strategyId, Integer awardId);

}
