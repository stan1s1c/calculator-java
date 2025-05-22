import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCalculateOperations() {
        testCalculation(Arrays.asList(2f, 3f), Arrays.asList("+"), 5f);
        testCalculation(Arrays.asList(5f, 3f), Arrays.asList("-"), 2f);
        testCalculation(Arrays.asList(4f, 3f), Arrays.asList("*"), 12f);
        testCalculation(Arrays.asList(10f, 2f), Arrays.asList("/"), 5f);
    }
    
    @Test
    public void testOperatorPrecedence() {
        testCalculation(Arrays.asList(2f, 3f, 4f), Arrays.asList("+", "*"), 14f);
        testCalculation(Arrays.asList(10f, 2f, 3f), Arrays.asList("/", "-"), 2f);
    }
    
    @Test
    public void testNegativeNumbers() {
        testCalculation(Arrays.asList(-5f, 3f), Arrays.asList("+"), -2f);
        testCalculation(Arrays.asList(5f, -3f), Arrays.asList("*"), -15f);
    }
    
    private void testCalculation(List<Float> numbers, List<String> operations, float expected) {
        Calculator.finalResult = 0;
        Calculator.Calculate(new ArrayList<>(numbers), new ArrayList<>(operations));
        assertEquals(expected, Calculator.finalResult, 0.0001f);
    }
}