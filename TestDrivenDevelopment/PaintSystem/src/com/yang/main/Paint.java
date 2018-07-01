package com.yang.main;

import lombok.Getter;

@Getter
public class Paint {
    public static final int MIN_WHITE_DROPS = 50;

    private int redPigmentDrops;
    private int bluePigmentDrops;
    private int yellowPigmentDrops;
    private int whitePigmentDrops;
    private PaintFinish finish;

    public Paint(final int redPigmentDrops,
                final int bluePigmentDrops,
                final int yellowPigmentDrops,
                final int whitePigmentDrops,
                final PaintFinish finish)
        throws InsufficientWhiteException {

        validateWhiteDrops(whitePigmentDrops, finish);

        this.redPigmentDrops = redPigmentDrops;
        this.bluePigmentDrops = bluePigmentDrops;
        this.yellowPigmentDrops = yellowPigmentDrops;
        this.whitePigmentDrops = whitePigmentDrops;
        this.finish = finish;
    }

    private void validateWhiteDrops(final int whitePigmentDrops,
                                    final PaintFinish finish)
        throws InsufficientWhiteException {
        if (finish == PaintFinish.GLOSS && whitePigmentDrops < MIN_WHITE_DROPS) {
            throw new InsufficientWhiteException();
        }
    }

}
