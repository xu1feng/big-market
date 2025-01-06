package cn.bugstack.domain.strategy.model.valobj;

import lombok.*;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2025/1/6 20:46
 * @description: 规则权重值对象
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleWeightVO {

    private String ruleValue;

    private Integer weight;

    private List<Integer> awardIds;

    private List<Award> awardList;

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Award {
        private Integer awardId;
        private String awardTitle;
    }

}
