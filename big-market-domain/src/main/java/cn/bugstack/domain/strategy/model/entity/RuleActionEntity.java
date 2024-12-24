package cn.bugstack.domain.strategy.model.entity;

import cn.bugstack.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import lombok.*;

/**
 * @author: Xuyifeng
 * @date: 2024/12/24 19:21
 * @description: 规则动作实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity <T extends RuleActionEntity.RaffleEntity> {

    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();

    private String ruleModel;
    private T data;

    static public class RaffleEntity {

    }

    // 抽奖之前过滤
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = true)
    static public class RaffleBeforeEntity extends RaffleEntity {

        /**
         * 策略ID
         */
        private Long strategyId;

        /**
         * 权重值Key；用于抽奖时可以选择权重抽奖。
         */
        private String ruleWeightValueKey;

        /**
         * 奖品ID；
         */
        private Integer awardId;

    }

    // 抽奖中过滤
    static public class RaffleCenterEntity extends RaffleEntity {

    }

    // 抽奖之后过滤
    static public class RaffleAfterEntity extends RaffleEntity {

    }


}
