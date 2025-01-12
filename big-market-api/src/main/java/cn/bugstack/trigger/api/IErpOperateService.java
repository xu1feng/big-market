package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.dto.ESUserRaffleOrderResponseDTO;
import cn.bugstack.trigger.api.response.Response;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description ERP 运营接口
 * @create 2024-09-21 12:26
 */
public interface IErpOperateService {

    Response<List<ESUserRaffleOrderResponseDTO>> queryUserRaffleOrder();

}
