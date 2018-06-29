package com.yang.tests;

import static org.junit.Assert.assertEquals;

import com.yang.main.Paint;
import com.yang.main.PaintFinish;
import org.junit.Test;

public class PaintTest {
    @Test
    public void testRetrievePaintAttributes() {
        Paint p = Paint.builder()
            .redPigmentDrops(5)
            .bluePigmentDrops(8)
            .yellowPigmentDrops(10)
            .whitePigmentDrops(25)
            .finish(PaintFinish.GLOSS)
            .build();

        assertEquals(5, p.getRedPigmentDrops());
        assertEquals(8, p.getBluePigmentDrops());
        assertEquals(10, p.getYellowPigmentDrops());
        assertEquals(25, p.getWhitePigmentDrops());
        assertEquals(PaintFinish.GLOSS, p.getFinish());

    }


}
