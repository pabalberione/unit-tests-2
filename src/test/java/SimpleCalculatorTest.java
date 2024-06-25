import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualsFour(){ //Puede no ponerse public al iniciar el metodo
        var calculator = new SimpleCalculator();//Por inferencia de tipos se puede poner var
        assertEquals(4,calculator.add(2,2));
    }
}