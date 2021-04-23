import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class TestPasswordValidator {

    @Test
    public void validateLengthTrue(){
        //GIVEN
        String password1 = "12345789";
        int minLength1 = 4;
        String password2 = "12345789";
        int minLength2 = 8;
        String password3 = "";
        int minLength3 = 0;

        //WHEN
        boolean test1 = PasswordValidator.validateLength(password1, minLength1);
        boolean test2 = PasswordValidator.validateLength(password2, minLength2);
        boolean test3 = PasswordValidator.validateLength(password3, minLength3);

        //THEN
        assertTrue(test1);
        assertTrue(test2);
        assertTrue(test3);

    }

    @Test
    public void validateLengthFalse(){
        //GIVEN
        String password1 = "";
        int minLength1 = 1;
        String password2 = "12345789";
        int minLength2 = 40;

        //WHEN
        boolean test1 = PasswordValidator.validateLength(password1, minLength1);
        boolean test2 = PasswordValidator.validateLength(password2, minLength2);

        //THEN
        assertFalse(test1);
        assertFalse(test2);

    }
    @ParameterizedTest (name="{1} shouldBeDigits {0}")
    @CsvSource({"true, 1234567", "true, fzwuu23", "false, ufffg"})
    public void validateDigitsTest(boolean expected, String password){

        boolean actual = PasswordValidator.validateDigits(password);
        assertEquals(expected, actual);

    }

    @ParameterizedTest (name="{1} Upper Letter should be {0}")
    @CsvSource({"true, 123456HI7", "true, fzwuZZu23", "false, ufffg", "false, 273764","false, ?$5jdi","true, @928??H", "false, @!!§?%%"})
    public void validateUpperLetterTest(boolean expected, String password){

        boolean actual = PasswordValidator.validateUpperLetter(password);
        assertEquals(expected, actual);
    }



}
