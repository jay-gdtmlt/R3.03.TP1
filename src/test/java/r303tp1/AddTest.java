package r303tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {
    @Testvoid testAdd() {
        float a, b, sum;
        a = 3;
        b = 8;
        sum = add(a, b);
        assertEquals((a+b), sum);
    }
}