

import Src.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BASIT
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void addShouldAddthePositieNumbersInRange(){
        int a =3;
        int b =4;
        Calculator c = new Calculator();
        int expectedResult = 7;
        int result = c.add(a, b);
        assertEquals(expectedResult,result);
    }
    
    public void addMethodCannotSupportFloatValues(){
        float a =(float) 1.2;
        float b = (float) 1.3;
        Calculator c = new Calculator();
        float expectedResult = (float) 2.5;
        int result = c.add('b', 'c');
        assertEquals(expectedResult,result);
    }
    
}
