package com.weva.ai.billing.util;

import com.weva.ai.billing.document.EventType;
import com.weva.ai.billing.document.SubscriptionPlan;
import com.weva.ai.billing.dto.EventTypeDTO;
import com.weva.ai.billing.dto.SubscriptionPlanDTO;
import org.springframework.beans.BeanUtils;


public class DocumentMapper {
    public static SubscriptionPlanDTO toDTO(SubscriptionPlan subscriptionPlan) {
        SubscriptionPlanDTO dto = new SubscriptionPlanDTO();
        BeanUtils.copyProperties(subscriptionPlan  , dto);
        dto.setEventTypes(subscriptionPlan.getEventTypes().stream().map(DocumentMapper::toDTO).toList());
        return dto;
    }

    public static EventTypeDTO toDTO(EventType eventType){
        EventTypeDTO dto = new EventTypeDTO();
        BeanUtils.copyProperties(eventType,dto);
        return dto;
    }
}
