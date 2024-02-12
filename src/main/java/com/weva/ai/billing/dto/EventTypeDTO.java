package com.weva.ai.billing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventTypeDTO {
    private String code;
    private String name;
    private String description;
    private Double perUnitCharge;
    private Integer freeUnitsCount;


}
