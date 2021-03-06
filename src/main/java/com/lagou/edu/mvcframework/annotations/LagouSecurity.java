package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

@Documented                         // 被java认出来
@Target(ElementType.METHOD)          // 可以加在的地方
@Retention(RetentionPolicy.RUNTIME) // 生存周期
public @interface LagouSecurity {
    String value() default "";
}
