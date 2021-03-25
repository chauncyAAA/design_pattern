package com.chauncy.designpattern.strategy_pattern;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operator(){
        strategy.operator();
    }
}
