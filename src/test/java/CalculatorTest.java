import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(calculator.add(2, 3), 5);
        assertEquals(calculator.add(-4, 4), 0);
        assertEquals(calculator.add(1, 0), 1);
    }

    @Test
    void dif() {
        assertEquals(calculator.dif(10, 5), 5);
        assertEquals(calculator.dif(3, 6), -3);
        assertEquals(calculator.dif(4, 4), 0);
    }

    @Test
    void div() {
        assertEquals(calculator.div(10, 5), 2);
        assertEquals(calculator.div(2, 2), 1);
        assertThrows(IllegalArgumentException.class, () -> calculator.div(2,0));
    }

    @Test
    void times() {
        assertEquals(calculator.times(2, 2), 4);
        assertEquals(calculator.times(5, 0), 0);
        assertEquals(calculator.times(-2, 7), -14);
    }

    @Test
    void solverLisa() {
        assertEquals(calculator.solverLisa(), 2);
    }

    @Test
    void solverVlad() {
        assertEquals(calculator.solverVlad(), 14);
    }
}
