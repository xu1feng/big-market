package cn.bugstack.test.domain;

import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.domain.strategy.service.rule.chain.ILogicChain;
import cn.bugstack.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import cn.bugstack.domain.strategy.service.rule.chain.impl.RuleWeightLogicChain;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

/**
 * @author: Xuyifeng
 * @date: 2024/12/25 19:44
 * @description: 抽奖责任链测试，验证不同的规则走不同的责任链
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogicChainTest {

    @Resource
    private IStrategyArmory strategyArmory;
    @Resource
    private RuleWeightLogicChain ruleWeightLogicChain;
    @Resource
    private DefaultChainFactory defaultChainFactory;

    @Before
    public void setUp() {
        // 策略装配 100001、100002、100003
        strategyArmory.assembleLotteryStrategy(100001L);
        strategyArmory.assembleLotteryStrategy(100002L);
        strategyArmory.assembleLotteryStrategy(100003L);
    }

    @Test
    public void test_LogicChain_rule_blacklist() {
        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("user001", 100001L);
        log.info("测试结果：{}", strategyAwardVO);
    }

    @Test
    public void test_LogicChain_rule_weight() {
        // 通过反射 mock 规则中的值
        ReflectionTestUtils.setField(ruleWeightLogicChain, "userScore", 4900L);

        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("xuyifeng", 100001L);
        log.info("测试结果：{}", strategyAwardVO);
    }

    @Test
    public void test_LogicChain_rule_default() {
        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("xuyifeng", 100001L);
        log.info("测试结果：{}", strategyAwardVO);
    }

}
