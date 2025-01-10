package cn.bugstack.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Xuyifeng
 * @date: 2025/1/6 20:18
 * @description: 用户活动账户请求对象
 */
@Data
public class UserActivityAccountRequestDTO implements Serializable {

    private String userId;
    private Long activityId;

}
