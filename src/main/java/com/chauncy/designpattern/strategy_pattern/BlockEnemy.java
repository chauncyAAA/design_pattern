package com.chauncy.designpattern.strategy_pattern;

public class BlockEnemy implements IStrategy {
    @Override
    public void operator() {
        System.out.println("阻击追兵");
    }
}
