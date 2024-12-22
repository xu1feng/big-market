package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Award;
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

}
