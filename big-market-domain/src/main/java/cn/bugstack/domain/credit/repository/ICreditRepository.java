package cn.bugstack.domain.credit.repository;

import cn.bugstack.domain.credit.model.aggregate.TradeAggregate;

/**
 * @author: Xuyifeng
 * @date: 2025/1/9 15:20
 * @description: 用户积分仓储接口
 */

public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

}
