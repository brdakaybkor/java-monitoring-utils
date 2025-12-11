package com.demo.monitoring.metrics;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TimedOperation {
    String value() default "";
}
