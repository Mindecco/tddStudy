package tddBookStudy.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class chapter2MainTest {


    @Test
    void plus(){
        int result =CalculatorTest.plus(1,2);
        assertEquals(3,result);
        assertEquals(5, CalculatorTest.plus(4,1));
    }

}
