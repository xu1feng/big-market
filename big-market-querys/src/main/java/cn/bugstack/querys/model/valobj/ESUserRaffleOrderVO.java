package cn.bugstack.querys.model.valobj;


import lombok.Builder;
import lombok.Getter;

import java.util.Date;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 用户抽奖订单表值对象
 * @create 2024-09-21 10:11
 */
@Getter
@Builder
public class ESUserRaffleOrderVO {

    /** 用户ID */
    private String userId;
    /** 活动ID */
    private Long activityId;
    /** 活动名称 */
    private String activityName;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 订单ID */
    private String orderId;
    /** 下单时间 */
    private Date orderTime;
    /** 订单状态；create-创建、used-已使用、cancel-已作废 */
    private String orderState;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
