package com.yang.main;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Paint {

    private int redPigmentDrops;
    private int bluePigmentDrops;
    private int yellowPigmentDrops;
    private int whitePigmentDrops;
    private PaintFinish finish;
    
}
