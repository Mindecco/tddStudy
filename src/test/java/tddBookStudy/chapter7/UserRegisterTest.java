package tddBookStudy.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRegisterTest {
  //  private UserRegister userRegister;
   // private StubWeakPasswordChecker stubPasswordChecker = new StubWeakPasswordChecker();

    @BeforeEach
    void setpUp(){
    //    userRegister = new UserRegister(stubPasswordChecker);
    }

    @DisplayName("약한 암호면 가입 실패")
    @Test
    void weakPassword(){
   //     stubPasswordChecker.setWeak(true); // 암호가 약하다고 응답하도록 설정


    }
}
