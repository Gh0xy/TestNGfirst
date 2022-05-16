import org.testng.annotations.Test;
import org.testng.Assert;
import org.example.Calculator;

public class CalculatorTest {

    @Test
    void add() {
        Assert.assertEquals  (4, Calculator.add(2, 2));
    }

    @Test
    public void multiply() {
                Assert.assertEquals(4, Calculator.multiply(2, 2));
                Assert.assertEquals(-4, Calculator.multiply(2, -2));
                Assert.assertEquals(4, Calculator.multiply(-2, -2));
                Assert.assertEquals(0, Calculator.multiply(1, 0));
    }
}