package com.tencent.supersonic.headless.api.pojo.enums;

public enum MapModeEnum {
    STRICT(0), MODERATE(2), LOOSE(4), ALL(6);

    // 严格模式， 中等模式，宽松模式，全部模式
    public int threshold; // 阈值

    MapModeEnum(Integer threshold) {
        this.threshold = threshold;
    }
}
