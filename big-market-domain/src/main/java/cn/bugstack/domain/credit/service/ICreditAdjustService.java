package cn.bugstack.domain.credit.service;

import cn.bugstack.domain.credit.model.entity.TradeEntity;

/**
 * @author: Xuyifeng
 * @date: 2025/1/9 15:22
 * @description: 积分调额接口【正逆向，增减积分】
 */

public interface ICreditAdjustService {

    String createOrder(TradeEntity tradeEntity);

}
