package cn.bugstack.domain.award.service;

import cn.bugstack.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @author: Xuyifeng
 * @date: 2025/1/3 15:46
 * @description: 奖品服务接口
 */

public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
