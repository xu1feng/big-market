package cn.bugstack.domain.strategy.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author: Xuyifeng
 * @date: 2024/12/24 20:54
 * @description: 抽奖策略规则值对象；值对象，没有唯一ID，仅限于从数据库查询对象
 */
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StrategyAwardRuleModelVO {

    private String ruleModels;

}
