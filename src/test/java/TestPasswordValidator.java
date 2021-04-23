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
    @CsvSource({"true, 123456HI7", "true, fzwuZZu23", "false, ufffg", "false, 273764","false, ?$5jdi","true, @928??H",
            "false, @!!§?%%"})
    public void validateUpperLetterTest(boolean expected, String password){

        boolean actual = PasswordValidator.validateUpperLetter(password);
        assertEquals(expected, actual);
    }

    @ParameterizedTest (name="{1} Lower Letter should be {0}")
    @CsvSource({"false, 123456HI7", "true, fzwuZZu23", "true, ufffg", "false, 273764","true, ?$5jdi","false, @928??H",
            "false, @!!§?%%"})
    public void validateLowerLetterTest(boolean expected, String password){

        boolean actual = PasswordValidator.validateLowerLetter(password);
        assertEquals(expected, actual);
    }

    @ParameterizedTest (name="Password: \"{1}\" with minLenght: {2} should be: {0}")
    @CsvSource({"true, Ha3, 2",
            "true, Ha3, 3",
            "true, Ha3, 0",
            "false, Ha3, 8",
            "false, Ha, 2",
            "false, H3, 2",
            "false, a3, 2",
            "false, '', 0"})
    public void validatePasswordTest(boolean expected, String password, int minLenght){
        boolean actual = PasswordValidator.validatePassword(password, minLenght);
        assertEquals(expected, actual);
    }

    @Test
    public void validatePasswordArrayTest(){
        String[] passwordArray = {"Ha3","Ha3", "Ha", "H3", "a3", ""};
        boolean[] validationArray = {true, true, false, false, false, false};

        assertArrayEquals(validationArray, PasswordValidator.validatePasswordArray(passwordArray, 3));
    }


}
