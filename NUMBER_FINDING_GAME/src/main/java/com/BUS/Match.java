package com.BUS;

import com.DTO.NumberPoint;

import java.util.Stack;

public class Match {
    private String strIdRoom;
    private long longMatchTime;

    private Map map;
    private Stack<NumberPoint> stacks;

    public Match() {
    }

    public Match(String strIdRoom, long longMatchTime) {
        this.strIdRoom = strIdRoom;
        this.longMatchTime = longMatchTime;
    }

    /**
     * Create new map random, if it not exists
     *
     * @param startValue giá trị bắt đẩu
     * @param endValue   giá trị kết thúc
     */
    public void createRandomMap(int startValue, int endValue) {
//        check is NULL
        if (map == null) {
            map = new Map();
        }
        if (stacks == null) {
            stacks = new Stack<>();
        }

        map.setStartValue(startValue);
        map.setEndValue(endValue);

        map.createNew(770, 0, 470, 0);

//        Put in to stack
        for (NumberPoint DTO : map.getList()) {
            stacks.push(DTO);
        }
    }

    public void createRandomMap() {
        createRandomMap(1, 100);
    }

    /**
     * If dont have next value return -1
     *
     * @return Next value for choice
     */
    public NumberPoint getNextValue() {
        if (stacks.isEmpty()) {
            return null;
        }
        return stacks.pop();
    }
















    public String getStrIdRoom() {
        return strIdRoom;
    }

    public void setStrIdRoom(String strIdRoom) {
        this.strIdRoom = strIdRoom;
    }

    public long getLongMatchTime() {
        return longMatchTime;
    }

    public void setLongMatchTime(long longMatchTime) {
        this.longMatchTime = longMatchTime;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Stack<NumberPoint> getStacks() {
        return stacks;
    }

    public void setStacks(Stack<NumberPoint> stacks) {
        this.stacks = stacks;
    }
}