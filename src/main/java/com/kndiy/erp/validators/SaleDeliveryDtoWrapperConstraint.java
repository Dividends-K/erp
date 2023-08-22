package com.kndiy.erp.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SaleDeliveryDtoWrapperValidator.class)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SaleDeliveryDtoWrapperConstraint {
    String message() default "Please check!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
