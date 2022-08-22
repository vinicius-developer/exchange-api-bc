package com.api.bcb.currency.commom.api.date.simple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateSimplesDateTest {

    @Test
    void validateCorrectDates() {

        boolean result = ValidateSimpleDate.isValid("02-25-2002");

        assertTrue(result);

    }

    @Test
    void validateInvalidDates() {

        boolean result = ValidateSimpleDate.isValid("25/02/2002");

        assertFalse(result);

    }

    @Test
    void validateNullValue() {

        boolean result = ValidateSimpleDate.isValid(null);

        assertFalse(result);

    }

    @Test
    void validateEmptyString() {

        boolean result = ValidateSimpleDate.isValid("");

        assertFalse(result);

    }
    
}
