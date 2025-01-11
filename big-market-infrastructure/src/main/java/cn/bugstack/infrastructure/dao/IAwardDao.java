package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2024/12/22 21:15
 * @description: 奖品表DAO
 */
@Mapper
public interface IAwardDao {

    // 查询奖品列表
    List<Award> queryAwardList();

    String queryAwardConfigByAwardId(Integer awardId);

    String queryAwardKeyByAwardId(Integer awardId);

}
