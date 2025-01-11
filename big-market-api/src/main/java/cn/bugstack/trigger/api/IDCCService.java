package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.response.Response;

/**
 * @author: Xuyifeng
 * @date: 2025/1/11 10:51
 * @description: DCC 动态配置中心
 */

public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);

}
