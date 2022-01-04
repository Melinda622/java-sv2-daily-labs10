package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking = new Hiking();
    List<Double> heights = Arrays.asList(10.0, 20.0, 15.0, 18.0);
    List<Double> heights2 = Arrays.asList(10.0, 20.0, 15.0, 25.0, 18.0);
    List<Double> heights3 = Arrays.asList(30.0, 25.0, 20.0, 10.0);

    @Test
    void testGetElevationPlus() {
        assertEquals(13, hiking.getPlusElevation(heights));
        assertEquals(20, hiking.getPlusElevation(heights2));
        assertEquals(0, hiking.getPlusElevation(heights3));
    }
}