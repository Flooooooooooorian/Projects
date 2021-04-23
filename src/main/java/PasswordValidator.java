public class PasswordValidator {

    public static boolean validateLength(String password, int minLength){
        return password.length() >= minLength;
    }

    public static boolean validateDigits(String password){
        return false;
    }
}
