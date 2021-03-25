package com.chauncy.designpattern.strategy_pattern;

public class BackDoor implements IStrategy {
    @Override
    public void operator() {
        System.out.println("开个后门");
    }
}
