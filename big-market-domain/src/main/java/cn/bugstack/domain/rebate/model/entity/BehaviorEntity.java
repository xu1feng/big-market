package cn.bugstack.domain.rebate.model.entity;

import cn.bugstack.domain.rebate.model.valobj.BehaviorTypeVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Xuyifeng
 * @date: 2025/1/5 19:07
 * @description: 行为实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BehaviorEntity {

    private String userId;

    private BehaviorTypeVO behaviorTypeVO;

    private String outBusinessNo;

}
