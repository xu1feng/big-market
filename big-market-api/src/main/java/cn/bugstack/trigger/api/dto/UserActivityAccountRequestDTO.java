package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @author: Xuyifeng
 * @date: 2025/1/6 20:18
 * @description: 用户活动账户请求对象
 */
@Data
public class UserActivityAccountRequestDTO {

    private String userId;
    private Long activityId;

}
