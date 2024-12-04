import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assert(calculator.add(2, 3) == 5);
        assert(calculator.add(-4, 4) == 0);
        assert(calculator.add(1, 0) == 1);
    }

    @Test
    void dif() {
        assert(calculator.dif(10, 5) == 5);
        assert(calculator.dif(3, 6) == -3);
        assert(calculator.dif(4, 4) == 0);
    }

    @Test
    void div() {
        assert(calculator.div(10, 5) == 5);
        assert(calculator.div(2, 2) == 1);
        assertThrows(ArithmeticException.class, () -> calculator.div(2, 0));
    }

    @Test
    void times() {
        assert(calculator.times(2, 2) == 4);
        assert(calculator.times(5, 0) == 0);
        assert(calculator.times(-2, 7) == -14);
    }

    @Test
    void solver() {
        assert(calculator.solver() == 14);
    }
}
