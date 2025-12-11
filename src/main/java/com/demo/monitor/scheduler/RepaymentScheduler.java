package com.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RepaymentScheduler {

    private static final Logger log = LoggerFactory.getLogger(RepaymentScheduler.class);

    // Run every day at 02:00
    @Scheduled(cron = "0 0 2 * * *")
    public void generateRepaymentSchedules() {
        log.info("Running daily repayment schedule generation job");
        // demo: generate planned installments...
    }

    // Run every hour to detect missed payments
    @Scheduled(cron = "0 0 * * * *")
    public void checkMissedPayments() {
        log.info("Checking for missed payments...");
        // demo: query DB, mark overdue, enqueue notification...
    }
}
