package com.weva.ai.billing.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventType {
    private String code;
    private String name;
    private String description;

    @Field("per_unit_charge")
    private Double perUnitCharge;

    @Field("free_units_count")
    private Integer freeUnitsCount;


}
