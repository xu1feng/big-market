package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.UserCreditAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Xuyifeng
 * @date: 2025/1/7 16:44
 * @description: 用户积分账户
 */
@Mapper
public interface IUserCreditAccountDao {

    int updateAddAmount(UserCreditAccount userCreditAccountReq);

    void insert(UserCreditAccount userCreditAccountReq);

    UserCreditAccount queryUserCreditAccount(UserCreditAccount userCreditAccountReq);

    int updateSubtractionAmount(UserCreditAccount userCreditAccountReq);

}
