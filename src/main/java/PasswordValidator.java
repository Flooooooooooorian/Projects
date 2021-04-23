public class PasswordValidator {

    public static boolean validateLength(String password, int minLength){
        return password.length() >= minLength;
    }

    public static boolean validateDigits(String password){
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


}
