package com.demo.monitoring.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimedOperationAspect {

    private final MeterRegistry meterRegistry;

    public TimedOperationAspect(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Around("@annotation(timedOperation)")
    public Object timeMethod(ProceedingJoinPoint pjp, TimedOperation timedOperation) throws Throwable {
        String metricName = timedOperation.value();
        if (metricName.isEmpty()) {
            metricName = "operation_" + pjp.getSignature().getName();
        }

        Timer.Sample sample = Timer.start(meterRegistry);
        try {
            return pjp.proceed();
        } finally {
            sample.stop(meterRegistry.timer(metricName));
        }
    }
}
