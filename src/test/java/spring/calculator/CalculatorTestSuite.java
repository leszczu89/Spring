package spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        calculator.sub(10.5, 2.5);
        calculator.add(10.5, 4.4);
        calculator.div(9.9,3.3);
        calculator.mul(4.9, 2.5);
        //Then
    }
}
