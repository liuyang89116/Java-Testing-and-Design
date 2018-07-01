package com.yang.tests;

import static org.junit.Assert.assertEquals;

import com.yang.main.InsufficientWhiteException;
import com.yang.main.Paint;
import com.yang.main.PaintFinish;
import org.junit.Test;

public class PaintTest {
    @Test
    public void testRetrievePaintAttributes() throws InsufficientWhiteException {
        Paint p = new Paint(5,
                            8,
                            10,
                            Paint.MIN_WHITE_DROPS + 1,
                            PaintFinish.GLOSS);

        assertEquals(5, p.getRedPigmentDrops());
        assertEquals(8, p.getBluePigmentDrops());
        assertEquals(10, p.getYellowPigmentDrops());
        assertEquals(Paint.MIN_WHITE_DROPS + 1, p.getWhitePigmentDrops());
        assertEquals(PaintFinish.GLOSS, p.getFinish());

    }

    @Test(expected = InsufficientWhiteException.class)
    public void testThrowInsufficientWhiteException()
        throws InsufficientWhiteException {
        Paint p = new Paint(5,
            8,
            10,
            Paint.MIN_WHITE_DROPS - 1,
            PaintFinish.GLOSS);
    }

}
