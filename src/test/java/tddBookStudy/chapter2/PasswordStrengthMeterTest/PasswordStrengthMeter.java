package tddBookStudy.chapter2.PasswordStrengthMeterTest;

public class PasswordStrengthMeter {

    public static PasswordStrength meter (String password){

        if(password == null || password.isEmpty()) return PasswordStrength.INVALID;

        int meterCnt = getMetCriteriaCounts(password);

        if( meterCnt <= 1 ) return PasswordStrength.WEAK;
        if( meterCnt == 2 ) return PasswordStrength.NORMAL;

        return PasswordStrength.STRONG;

    }

    private static int getMetCriteriaCounts(String password) {
        int meterCnt = 0;
        if( password.length() >= 8 )        meterCnt++;
        if( containsUppercase(password) )   meterCnt++;
        if( containsNumber(password) )      meterCnt++;

        return meterCnt;
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
