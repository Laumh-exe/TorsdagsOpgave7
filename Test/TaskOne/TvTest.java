package TaskOne;
import TaskOne.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvTest {

    Tv tv1;
    Tv tv2;
    Tv tv3;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        tv2 = new Tv();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

        tv3 = new Tv();
    }

    @Test
    void testVolume1() {
        assertEquals(3, tv1.getVolume());
    }

    @Test
    void testVolume2() {
        assertEquals(1, tv2.getVolume());
    }

    @Test
    void testChannel1() {
        assertEquals(30, tv1.getChannel());
    }

    @Test
    void testChannel2() {
        assertEquals(0, tv2.getChannel());
    }

    @Test
    void testOnState1() {
        assertEquals(true, tv1.isOnState());
    }

    @Test
    void testOnState2() {
        assertEquals(true, tv2.isOnState());
    }

    @Test
    void testOnState3() {
        assertEquals(false, tv3.isOnState());
    }
}