package com.demo.eligibility.controller;

import com.demo.eligibility.model.LoanRequest;
import com.demo.eligibility.model.EligibilityResult;
import com.demo.eligibility.service.EligibilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
public class EligibilityController {

    private final EligibilityService service;

    public EligibilityController(EligibilityService service) {
        this.service = service;
    }

    @PostMapping("/check")
    public EligibilityResult checkEligibility(@RequestBody LoanRequest request) {
        return service.evaluate(request);
    }
}
