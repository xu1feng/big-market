package cn.bugstack.domain.award.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author: Xuyifeng
 * @date: 2025/1/7 17:18
 * @description: 用户积分奖品实体对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreditAwardEntity {

    private String userId;

    private BigDecimal creditAmount;

}
