package cn.bugstack.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Xuyifeng
 * @date: 2024/12/28 16:38
 * @description: 抽奖请求参数
 */
@Data
public class RaffleStrategyRequestDTO implements Serializable {

    // 抽奖策略ID
    private Long strategyId;

}
