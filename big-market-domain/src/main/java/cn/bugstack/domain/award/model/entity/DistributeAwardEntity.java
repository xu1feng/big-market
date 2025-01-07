package cn.bugstack.domain.award.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Xuyifeng
 * @date: 2025/1/7 16:49
 * @description: 分发奖品实体对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistributeAwardEntity {

    private String userId;

    private String orderId;

    private Integer awardId;

    private String awardConfig;

}
