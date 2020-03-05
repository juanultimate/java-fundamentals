package edu.demo.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(rangeValidator.isValid(50)).isTrue();
    }

    @Test
    @DisplayName("Should return false given 200")
    void twoHundred_isValid_returnsFalse() {
        assertThat(rangeValidator.isValid(200)).isFalse();
    }

    @Test
    @DisplayName("Should return false given -10")
    void minus10_isValid_returnsTrue() {
        assertThat(rangeValidator.isValid(-10)).isFalse();
    }

}