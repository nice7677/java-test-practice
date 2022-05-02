package kr.springboot.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;

public class GameGenMockTest {

    @Test
    void mockTest() {

        GameNumGen genMock = mock(GameNumGen.class);

        given(genMock.generate(GameLevel.EASY)).willReturn("123");

        String num = genMock.generate(GameLevel.NORMAL);
        // mockito와 일치하는 스텁 설정이 없을 때 기본 값을 리턴한다.
        // int 0, boolean false, String or List ... Object is Null
        assertEquals("123", num);

    }

    @Test
    void mockThrowTest() {
        GameNumGen genMock = mock(GameNumGen.class);
        given(genMock.generate(null)).willThrow(IllegalArgumentException.class);

        assertThrows(
                IllegalArgumentException.class,
                () -> genMock.generate(null)
        );

    }

}
