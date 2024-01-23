package tddBookStudy.chapter2.PasswordStrengthMeterTest;

public class PasswordStrengthMeter {

    public static PasswordStrength meter (String password){
        if( password.length() < 8 ) {
            if( !containsUppercase(password) ){
                return PasswordStrength.WEAK;
            }
            else if( !containsNumber(password) ){
                return PasswordStrength.WEAK;
            }
            else
                return PasswordStrength.NORMAL;
        }
        else{
            if( !containsUppercase(password) ){
                if( !containsNumber(password) )
                    return PasswordStrength.WEAK;
                else
                    return PasswordStrength.NORMAL;
            }
            else if( !containsNumber(password) ){
                return PasswordStrength.NORMAL;
            }
            else
                return PasswordStrength.STRONG;
        }
    }
    public static boolean containsUppercase(String input) {
        // 대문자가 포함되어 있는지 체크
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumber(String input) {
        // 숫자가 포함되어 있는지 체크
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
//    public static boolean containsSpecialCharacter(String input) {
//        // 정규 표현식을 사용하여 특수문자 여부를 체크
//        return input.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
//    }
}
