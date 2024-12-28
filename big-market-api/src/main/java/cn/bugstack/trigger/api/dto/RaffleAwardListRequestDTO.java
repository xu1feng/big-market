package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @author: Xuyifeng
 * @date: 2024/12/28 16:32
 * @description: 抽奖奖品列表、请求对象
 */
@Data
public class RaffleAwardListRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}
