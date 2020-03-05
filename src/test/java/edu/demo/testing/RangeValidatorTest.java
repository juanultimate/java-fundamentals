package edu.demo.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeValidatorTest {

    private RangeValidator rangeValidator;

    @BeforeEach
    void setUp() {
        rangeValidator = new RangeValidator();
    }

    /**
     * {@link RangeValidator#isValid(int)}
     */

    @Test
    @DisplayName("Should return true given 50")
    void fifty_isValid_returnsTrue() {
        rangeValidator.isValid(50);
    }

    @Test
    @DisplayName("Should return false given 200")
    void twoHundred_isValid_returnsFalse() {
        rangeValidator.isValid(200);
    }

    @Test
    @DisplayName("Should return false given -10")
    void minusTen_isValid_returnsFalse() {
        rangeValidator.isValid(-10);
    }

}