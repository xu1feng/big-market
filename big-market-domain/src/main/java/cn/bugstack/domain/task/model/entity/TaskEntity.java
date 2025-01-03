package cn.bugstack.domain.task.model.entity;

import lombok.Data;

/**
 * @author: Xuyifeng
 * @date: 2025/1/3 16:26
 * @description: 任务实体对象
 */
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}
