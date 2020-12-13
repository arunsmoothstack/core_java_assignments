package com.ss.day4.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test(expected = ArithmeticException.class)
    public void getSlope() {
        Line line = new Line(1,2,2,3);
        assertEquals(1, line.getSlope(), 0);
        line = new Line(1,2,1,2);
        line.getSlope();
    }

    @Test
    public void getDistance() {
        Line line = new Line(1,2,2,3);
        assertEquals(1.4142, line.getDistance(), .0001);
    }

}
