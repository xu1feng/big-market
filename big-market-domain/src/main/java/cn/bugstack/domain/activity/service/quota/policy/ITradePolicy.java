package cn.bugstack.domain.activity.service.quota.policy;

import cn.bugstack.domain.activity.model.aggregate.CreateQuotaOrderAggregate;

/**
 * @author: Xuyifeng
 * @date: 2025/1/9 16:20
 * @description: 交易策略接口，包括；返利兑换（不用支付），积分订单（需要支付）
 */

public interface ITradePolicy {

    void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate);

}
