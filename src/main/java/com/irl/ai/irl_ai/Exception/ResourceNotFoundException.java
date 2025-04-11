package com.irl.ai.irl_ai.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

    String resource;
    String fieldName;
    String fieldValue;
    public ResourceNotFoundException(String resource, String fieldName, String fieldValue) {
        super(String.format("Resource %s not found for field %s and value %s", resource, fieldName, fieldValue));
        this.resource = resource;
        this.fieldName = fieldName;
        this.fieldValue = String.valueOf(fieldValue);

    }
}
