package com.egg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        Assertions.assertTrue(true);
    }
    @Test
    public void createMockObject() {
        List<String> mockedArrayList = mock(List.class);
        when(mockedArrayList.size()).thenReturn(0);
        Assertions.assertEquals(0,mockedArrayList.size());
    }
}
