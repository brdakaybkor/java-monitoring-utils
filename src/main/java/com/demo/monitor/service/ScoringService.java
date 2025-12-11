package com.demo.scoring.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ScoringService {

    // Simple weighted scoring for demo
    public int calculateScore(Map<String, Integer> factors) {
        int base = 300;

        for (Map.Entry<String, Integer> entry : factors.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            switch (key) {
                case "paymentHistory" -> base += value * 3;
                case "utilization" -> base += value * 2;
                case "lengthOfHistory" -> base += value * 2;
                default -> base += value;
            }
        }

        return Math.min(base, 850);
    }
}
