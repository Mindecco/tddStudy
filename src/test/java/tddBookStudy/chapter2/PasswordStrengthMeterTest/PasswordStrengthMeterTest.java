package tddBookStudy.chapter2.PasswordStrengthMeterTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void meeetsAllCriteria_Then_Strong(){
        assertEquals(PasswordStrength.STRONG,PasswordStrengthMeter.meter("abcd!@AB245"));
        assertEquals(PasswordStrength.STRONG,PasswordStrengthMeter.meter("sdflk55j@AbfgjC"));
    }

    @Test
    void 길이만_8글자_미만이고_나머지조건은_충족(){
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("!@B12C"));
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("@BC1"));
    }

    @Test
    void 숫자를_포함하지않고_나머지충족(){
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("BCdsfsdfsdf"));
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("dvBCdHAsdf"));
    }

    @Test
    void 대문자를_포함하지않고_나머지충족(){
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("sdfsdf123"));
        assertEquals(PasswordStrength.NORMAL,PasswordStrengthMeter.meter("sdsdgfsbb24ffg"));
    }

    @Test
    void 길이도8글자미만이고_숫자도없고_대문자는충족(){
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("ABcd"));
    }
    @Test
    void 길이도8글자미만이고_대문자도없고_숫자만만족(){
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("3935av"));
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("35358"));
    }

    @Test
    void 숫자도없고_대문자도없고_길이만만족(){
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("sdfsdvsdv!!@"));
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("dfdfqrmnm$@%f"));
    }

    @Test
    void 숫자도없고_대문자도없고_길이도8보다짧음(){
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("dg@"));
        assertEquals(PasswordStrength.WEAK,PasswordStrengthMeter.meter("gh$@%f"));
    }
}
