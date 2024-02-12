package com.weva.ai.billing.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "billing_subscription_plans")
public class SubscriptionPlan {

    @Id
    @Field("_id")
    public String id;
    private String name;
    private String code;
    private String description;

    @Field("payment_fee_percent")
    private Double paymentFeePercent;
    @Field("per_practitioner_fee")
    private Double perPractitionerFee;
    @Field("currency")
    private String currency;
    @Field("max_practitioner_fee")
    private Integer maxPractitionerFee;

    @Field("practitioner_limit")
    private Integer practitionerLimit;

    @Field("event_types")
    private List<EventType> eventTypes;

}


