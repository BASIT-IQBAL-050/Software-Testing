import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckTest {

    @Test
    public void To_check_that_string_having_one_character_is_a_plaindrome(){
        String str = String.valueOf('a');
        boolean actualOutcome = PalindromeCheck.isPlaindrome(str);
        Assertions.assertTrue(actualOutcome);
    }
    @Test
    public  void To_check_that_string_having_two_differenct_character_is_not_a_palindrome(){
        String str = "ab";
        boolean actualOutcome = PalindromeCheck.isPlaindrome(str);
        Assertions.assertFalse(actualOutcome);
    }
    @Test
    public void To_check_that_string_having_more_multiple_character_is_palindrome(){
        String str = "mam";
        boolean actualOutcome = PalindromeCheck.isPlaindrome(str);
        Assertions.assertTrue(actualOutcome);
    }
}
