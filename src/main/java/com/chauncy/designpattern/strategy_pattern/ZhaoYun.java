package com.chauncy.designpattern.strategy_pattern;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("第一个锦囊妙计");
        context  = new Context(new BackDoor());
        context.operator();

        System.out.println("第二个锦囊妙计");
        context.setStrategy(new GiveGreenLight());
        context.operator();

        System.out.println("第三个锦囊妙计");
        context.setStrategy(new BlockEnemy());
        context.operator();
    }
}
