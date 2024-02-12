package com.weva.ai.billing.dto;

import com.weva.ai.billing.document.EventType;
import lombok.Data;

import java.util.List;

@Data
public class SubscriptionPlanDTO {

    private String id;
    private String name;
    private String code;
    private String description;
    private Double paymentFeePercent;
    private Double perPractitionerFee;
    private String currency;
    private Integer maxPractitionerFee;
    private Integer practitionerLimit;
    private List<EventTypeDTO> eventTypes;

}
