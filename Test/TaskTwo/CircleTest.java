package TaskTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle();

    @Test
    void circleTest() {

        assertThrows(NegativeNumberException.class, () -> {
            c.setRadius(-1);
        });
    }

    @Test
    void circleAreaTest0() {
        c.setRadius(0);
        assertEquals(Math.PI * 0 * 0, c.area());
    }

    @Test
    void circleAreaTest1() {
        c.setRadius(1);
        assertEquals(Math.PI * 1 * 1, c.area());
    }
}