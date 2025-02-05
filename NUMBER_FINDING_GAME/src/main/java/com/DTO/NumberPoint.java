package com.DTO;

import java.util.Random;

/**
 * MỘt kiểu dữ liệu Object trò chơi, có thể dùng cho hiển thị
 */
public class NumberPoint {
    private int intValue;
    private int intPosX;
    private int intPosY;

    private String strChosenColor;
    private String strRare;

    public NumberPoint() {
    }

    public NumberPoint(int intValue, int intPosX, int intPosY, String strChosenColor, String strRare) {
        this.intValue = intValue;
        this.intPosX = intPosX;
        this.intPosY = intPosY;
        this.strChosenColor = strChosenColor;
        this.strRare = strRare;
    }

    public void randomPosition(int posXMax, int posXMin, int posYMax, int posYMin) {
        Random rand = new Random();

        this.intPosX = rand.nextInt((posXMax - posXMin) + 1) + posXMin;
        this.intPosY = rand.nextInt((posYMax - posYMin) + 1) + posYMin;
    }

    /**
     * Check 2 Object NumberPoint
     * @param point The other Number for compare
     * @return true if 2 point is nearly
     */
    public boolean isNearly(NumberPoint point) {
//             a^2 + b^2 / 2
        int duongCheo = (int) Math.sqrt(1152) / 2;
        int khoanCach = (int) Math.sqrt(
                (this.intPosX - point.getIntPosX()) * (this.intPosX - point.getIntPosX()) +
                        (this.intPosY - point.getIntPosY()) * (this.intPosY - point.getIntPosY()));

        if (khoanCach <= duongCheo + 20) {
            return true;
        }
        return false;
    }











    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getIntPosX() {
        return intPosX;
    }

    public void setIntPosX(int intPosX) {
        this.intPosX = intPosX;
    }

    public int getIntPosY() {
        return intPosY;
    }

    public void setIntPosY(int intPosY) {
        this.intPosY = intPosY;
    }

    public String getStrChosenColor() {
        return strChosenColor;
    }

    public void setStrChosenColor(String strChosenColor) {
        this.strChosenColor = strChosenColor;
    }

    public String getStrRare() {
        return strRare;
    }

    public void setStrRare(String strRare) {
        this.strRare = strRare;
    }

    @Override
    public String toString() {
        return "NumberPoint{" +
                "intValue=" + intValue +
                ", intPosX=" + intPosX +
                ", intPosY=" + intPosY +
                ", strChosenColor='" + strChosenColor + '\'' +
                ", strRare='" + strRare + '\'' +
                '}';
    }
}
