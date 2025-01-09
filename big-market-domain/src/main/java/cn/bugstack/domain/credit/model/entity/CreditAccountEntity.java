package cn.bugstack.domain.credit.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author: Xuyifeng
 * @date: 2025/1/9 15:28
 * @description: 积分账户实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditAccountEntity {

    /** 用户ID */
    private String userId;
    /** 可用积分，每次扣减的值 */
    private BigDecimal adjustAmount;

}
