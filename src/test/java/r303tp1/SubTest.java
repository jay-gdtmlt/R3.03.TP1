package r303tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubTest {
    @Test
    void testSub() {
        float a = 5;
        float b = 3;
        float r = Sub.sub(a, b);
        assertEquals(2f, r);
    }
}
