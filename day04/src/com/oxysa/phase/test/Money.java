package com.oxysa.phase.test;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-14 21:28
 */
public class Money {
    //面值
    private int faceValue;
    //真假
    private boolean tureOrFalse;

    public Money() {
    }

    public Money(int faceValue, boolean tureOrFalse) {
        this.faceValue = faceValue;
        this.tureOrFalse = tureOrFalse;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public boolean isTureOrFalse() {
        return tureOrFalse;
    }

    public void setTureOrFalse(boolean tureOrFalse) {
        this.tureOrFalse = tureOrFalse;
    }
}