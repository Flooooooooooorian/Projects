package PasswordValidator;

import PasswordValidator.PasswordValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class TestPasswordValidator {

    @ParameterizedTest(name = "Password \"{0}\" with length {1} should be {2}")
    @CsvSource({"12345789, 4 , true",
            "12345789, 8, true",
            "'', 0, true",
            "123KKOFI, 15, false",
            "'', 1, false"})
    public void validateLengthTrue(String password, int minLength, boolean expected){
        boolean actual = PasswordValidator.validateLength(password, minLength);
        assertEquals(expected, actual);
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
    @CsvSource({"true, Ha3?, 2",
            "false, Ha3!, 45",
            "false, Ha3, 0",
            "false, Ha3, 8",
            "false, Hallo Welt, 2",
            "false, H3, 2",
            "false, a3, 2",
            "false, '', 0",
            "true, Ha3!, 3"})
    public void validatePasswordTest(boolean expected, String password, int minLength){
        boolean actual = PasswordValidator.validatePassword(password, minLength);
        assertEquals(expected, actual);
    }

    @Test
    public void validatePasswordArrayTest(){
        String[] passwordArray = {"Ha3!","Ha3", "Ha", "H3", "a3", "", "Hallo Welt"};
        boolean[] validationArray = {true, false, false, false, false, false, false};
        assertArrayEquals(validationArray, PasswordValidator.validatePasswordArray(passwordArray, 3));
    }

    @ParameterizedTest(name = "{0} has special Characters {1}")
    @CsvSource({"password, false",
            "password1, false",
            "password!, true",
            "pass word, true"})
    public void validateSpecialCharacterTest(String password, boolean expected) {
        boolean actual = PasswordValidator.validateSpecialCharacter(password);
        assertEquals(expected, actual);
    }

    @ParameterizedTest (name="Password: \"{1}\" should be: {0}")
    @CsvSource({"true, Ha3?",
            "false, ' '",
            "false, 'Ha '",
            "true, Ha3",
            "false, Hallo Welt"})
    public void validateWhitespaceTest(boolean expected, String password){
        boolean actual = PasswordValidator.validateWhitespace (password);
        assertEquals(expected, actual);
    }

}
