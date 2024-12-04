import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    public CalculatorTest() {
        this.calculator = new Calculator();
    }


    @Test
    void add() {
        assert(calculator.add(1, 1) == 2);
        assert(calculator.add(10, 3) == 13);
    }

    @Test
    void dif() {
        assert(calculator.dif(13, 2) == 11);
        assert(calculator.dif(5, 3) == 2);
    }

    @Test
    void div() {
        assert(calculator.div(12, 2) == 6);
        assert(calculator.div(9, 3) == 3);
        assertThrows(IllegalArgumentException.class, () -> calculator.div(2,0));
    }

    @Test
    void times() {
        assert(calculator.times(12, 2) == 24);
        assert(calculator.dif(9, 3) == 27);
    }
    @Test
    void solver() {
        assert(calculator.solver() == 2);
    }
}
