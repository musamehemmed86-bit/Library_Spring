package com.library.dea.validation;

public @interface Constraint {
    Class<PriceValidator> validatedBy();
}
