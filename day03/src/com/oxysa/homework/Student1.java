package com.oxysa.homework;

public class Student1 {
    private String name;
    private int chineseScore;
    private int mathScore;

    public Student1(String name, int chineseScore, int mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getSum() {
        return chineseScore + mathScore;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
