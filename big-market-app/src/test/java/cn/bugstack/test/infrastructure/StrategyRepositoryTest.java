package cn.bugstack.test.infrastructure;

import cn.bugstack.domain.strategy.model.valobj.RuleTreeVO;
import cn.bugstack.domain.strategy.repository.IStrategyRepository;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Xuyifeng
 * @date: 2024/12/26 17:14
 * @description: 仓储数据查询
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyRepositoryTest {

    @Resource
    private IStrategyRepository strategyRepository;

    @Test
    public void queryRUleTreeVOByTreeId() {
        RuleTreeVO ruleTreeVO = strategyRepository.queryRuleTreeVOByTreeId("tree_lock");
        log.info("测试结果: {}", JSON.toJSONString(ruleTreeVO));
    }

}
