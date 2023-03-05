import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumCalculatorTests {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach(){
        calc = new SumCalculator();
    }

    @Test
    public void testSumCalculatorCorrectWithOne(){
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
//        System.out.println("testSumCalculatorCorrectWithOne is correct");
    }

    @Test
    public void testSumCalculatorCorrectWithThree(){
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
//        System.out.println("testSumCalculatorCorrectWithThree is correct");

    }

    @Test
    public void testSumCalculatorCorrectWithZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
//        System.out.println("testSumCalculatorCorrectWithZero is correct");

    }
}
