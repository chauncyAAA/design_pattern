package com.chauncy.designpattern.strategy_pattern;

public class GiveGreenLight implements IStrategy {
    @Override
    public void operator() {
        System.out.println("一路开绿灯");
    }
}
