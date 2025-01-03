package cn.bugstack.domain.award.repository;

import cn.bugstack.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @author: Xuyifeng
 * @date: 2025/1/3 15:59
 * @description: 奖品仓储服务
 */

public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
