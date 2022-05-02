package kr.springboot.mockito;

import kr.springboot.study.Study;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoTest {

    @Test
    void studyMockito() {
        // given
        Study study = new Study(11);

        Mockito.when(study).thenReturn(new Study(11));

        assertEquals(study.getLimit(), 11);


    }

}
