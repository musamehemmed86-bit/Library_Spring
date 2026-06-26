
package com.library.dea.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<com.library.dea.validation.ValidPrice, Double> {

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext constraintValidatorContext) {

        if (value == null) {
            return false;
        }
        return value > 0;
    }
}

