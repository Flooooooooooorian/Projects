public class PasswordValidator {

    public static boolean[] validatePasswordArray(String[] passwords, int minLength) {
        boolean[] validation = new boolean[passwords.length];
        for (int i = 0; i < passwords.length; i++){
                validation[i] =validatePassword(passwords[i], minLength);
        }
        return validation;
    }

    public static boolean validatePassword(String password, int minLength) {
        return validateLength(password, minLength) && validateDigits(password)
                && validateLowerLetter(password) && validateUpperLetter(password)
                && validateSpecialCharacter(password) && validateWhitespace(password);
    }

    public static boolean validateWhitespace(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

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

    public static boolean validateUpperLetter(String password){
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateLowerLetter(String password){
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

}
