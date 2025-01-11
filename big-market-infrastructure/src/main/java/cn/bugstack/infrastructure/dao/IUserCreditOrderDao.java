package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.UserCreditOrder;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Xuyifeng
 * @date: 2025/1/9 15:14
 * @description: 用户积分流水单 DAO
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {

    void insert(UserCreditOrder userCreditOrder);

}
