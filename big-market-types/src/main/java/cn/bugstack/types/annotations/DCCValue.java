package cn.bugstack.types.annotations;

import java.lang.annotation.*;

/**
 * @author: Xuyifeng
 * @date: 2025/1/11 10:19
 * @description: 注解，动态配置中心
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface DCCValue {

    String value() default "";

}
