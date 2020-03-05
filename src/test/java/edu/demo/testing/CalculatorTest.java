package edu.demo.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Should return 2 given 2 & 0")
    void two_sum_zero_is_two() {
        assertThat(calc.sum(2, 0)).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return 4 given 2 & 2")
    void two_sum_two_is_four() {
        assertThat(calc.sum(2, 2)).isEqualTo(4);
    }
}
