
import Src.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private Calculator c;
    
    @BeforeClass
    public static void setUpClass() {
        // Executed once, before all test methods
        System.out.println("Before All Tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Executed once, after all test methods
        System.out.println("After All Tests");
    }
    
    @Before
    public void setUp() {
        // Executed before each test method
        c = new Calculator();
        System.out.println("Before Each Test");
    }
    
    @After
    public void tearDown() {
        // Executed after each test method
        c = null;
        System.out.println("After Each Test");
    }
    
    // Addition Test Cases-------------------------------------
    @Test
    public void addition_Should_Add_the_Positive_Numbers_InRange(){
        int a =3;
        int b =4;
        int expectedResult = 7;
        int result = c.addition(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void addition_Should_Add_the_Positive_Numbers_and_a_negative_number(){
        int a =3;
        int b =-4;
        int expectedResult = -1;
        int result = c.addition(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void addition_Should_Add_two_negative_number(){
        int a =-3;
        int b =-4;
        int expectedResult = -7;
        int result = c.addition(a, b);
        assertEquals(expectedResult,result);
    }
    
    // Subtract Test Cases -----------------------------------------
    
    @Test
    public void subtract_should_subtract_two_positive_numbers_in_range(){
        int a = 25;
        int b =10;
        int expectedResult= 15;
        int result = c.subtract(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void subtract_should_subtract_a_positive_number_and_a_negative_number(){
        int a = 25;
        int b =-10;
        int expectedResult= 35;
        int result = c.subtract(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void subtract_should_subtract_two_negative_numbers(){
        int a = -25;
        int b =-10;
        int expectedResult= -15;
        int result = c.subtract(a, b);
        assertEquals(expectedResult,result);
    }
    
    // Multiplication Test Cases -----------------------------------
    @Test
    public void multiply_should_multiply_tow_positive_numbers_in_range(){
        int a =3;
        int b =10;
        int expectedResult=30;
        int result = c.multiply(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void multiply_should_multiply_a_negative_and_a_positive_numbers(){
        int a =-3;
        int b =10;
        int expectedResult=-30;
        int result = c.multiply(a, b);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void multiply_should_multiply_tow_negative_numbers(){
        int a =-3;
        int b =-10;
        int expectedResult=30;
        int result = c.multiply(a, b);
        assertEquals(expectedResult,result);
    }
    
    // Division Test Cases ---------------------------------------
    @Test
    public void divide_should_divide_two_positive_numbers_in_range(){
        int a =10;
        int b =5;
        double expectedResult = 2;
        double result  = c.divide(a, b);
        assertEquals(expectedResult, result, 0.01);
    }
    
    @Test
    public void divide_should_divide_two_negative_numbers(){
        int a =-10;
        int b =-5;
        double expectedResult = (double)2;
        double result  = c.divide(a, b);
        assertEquals(expectedResult, result, 0.01);
    }
     
    @Test
    public void divide_should_divide_one_positive_number_and_one_negative(){
        int a =-10;
        int b =5;
        double expectedResult = (double)-2;
        double result  = c.divide(a, b);
        assertEquals(expectedResult, result, 0.01);
    }
      
    
    @Test(expected = ArithmeticException.class)
    public void divide_should_handle_the_case_if_divisor_is_zero(){
        int a =10;
        int b =0;
        Calculator c = new Calculator();
        double expectedResult = 0;
        double result  = c.divide(a, b);
        assertEquals(expectedResult, result, 0.01);
    }
    
}
