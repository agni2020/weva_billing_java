package com.weva.ai.billing.controller;

import com.weva.ai.billing.dto.SubscriptionPlanDTO;
import com.weva.ai.billing.model.APIResponse;
import com.weva.ai.billing.service.SubscriptionPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/plans")

public class SubscriptionPlanController {

    @Autowired
    SubscriptionPlanService subscriptionPlanService;


    @GetMapping("/all")
    public  ResponseEntity<APIResponse>  getAllPlans(){

        return ResponseEntity.ok(APIResponse.<List<SubscriptionPlanDTO>>builder()
                .status("SUCCESS")
                .data(subscriptionPlanService.getAllPlans(123,"sample"))
                .build());

    }


}
