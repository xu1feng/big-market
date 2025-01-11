package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.DailyBehaviorRebate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2025/1/5 18:58
 * @description: 日常行为返利活动配置
 */
@Mapper
public interface IDailyBehaviorRebateDao {

    List<DailyBehaviorRebate> queryDailyBehaviorRebateByBehaviorType(String behaviorType);

}
