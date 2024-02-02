package tddBookStudy.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;


import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

public class GameGenMockTest {

    @Test
    void mockTest(){

        // GameNumGen 인터페이스의 모의 객체( 구현 객체 ) 생성
        GameNumGen genMock = mock(GameNumGen.class);

        // 스텁 설정
        //given(genMock.generate(GameLevel.EASY)).willReturn("123");
        given(genMock.generate(any())).willReturn("123");

        // 메서드 실행
        String genStr = genMock.generate(GameLevel.EASY);

        Assertions.assertEquals(genStr,"123");
    }


    @Test
    @DisplayName("then,should 테스트")
    void init(){
        // GameNumGen 인터페이스의 모의 객체( 구현 객체 ) 생성
        GameNumGen genMock = mock(GameNumGen.class);

        // 스텁 설정
        //given(genMock.generate(GameLevel.EASY)).willReturn("123");
        given(genMock.generate(any())).willReturn("123");

        // 메서드 실행
        String genStr = genMock.generate(GameLevel.NORMAL);

        then(genMock).should().generate(any());

        //Assertions.assertEquals(genStr,"123");
    }


}
