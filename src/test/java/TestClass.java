import calculator.Addition;
import calculator.Division;
import calculator.Multiplication;
import calculator.Substraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {


    @Test(expected = ArithmeticException.class)
    public void divisionTest1(){
        Division division = new Division();
        division.calculateResult(4, 0);
    }

    @Test()
    public void divisionTest2(){
        Division division = new Division();
        assertEquals(division.calculateResult(2,2), 1, 0);
    }

    @Test
    public void additionTest() {
        Addition addition = new Addition();
        assertEquals(addition.calculateResult(2,2), 4, 0);
    }

    @Test
    public void multiplicationTest() {
        Multiplication multiplication = new Multiplication();
        assertEquals(multiplication.calculateResult(2,1), 2, 0);
    }

    @Test
    public void substractionTest() {
        Substraction substraction = new Substraction();
        assertEquals(substraction.calculateResult(4,2), 2, 0);
    }

}
