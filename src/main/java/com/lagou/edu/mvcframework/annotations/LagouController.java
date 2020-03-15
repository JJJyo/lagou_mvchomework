package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;


//     private void doInstance()  方法里 Controller和Service注释才会真的起效
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LagouController {
    String value() default "";
}
