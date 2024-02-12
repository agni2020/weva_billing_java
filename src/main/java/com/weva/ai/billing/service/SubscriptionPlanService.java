
package com.weva.ai.billing.service;

import com.weva.ai.billing.dto.SubscriptionPlanDTO;
import com.weva.ai.billing.repository.SubscriptionPlanRepository;
import com.weva.ai.billing.util.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionPlanService {

    @Autowired
    private SubscriptionPlanRepository subscriptionPlanRepository;

    public List<SubscriptionPlanDTO> getAllPlans(int i, String sample){
        return  subscriptionPlanRepository.findAll().stream().map(DocumentMapper::toDTO).toList();
    }

}
