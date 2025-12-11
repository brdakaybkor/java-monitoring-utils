package com.demo.eligibility.model;

public class EligibilityResult {
    private boolean eligible;
    private int score;
    private String reason;

    public EligibilityResult(boolean eligible, int score, String reason) {
        this.eligible = eligible;
        this.score = score;
        this.reason = reason;
    }

    public boolean isEligible() { return eligible; }
    public int getScore() { return score; }
    public String getReason() { return reason; }
}
