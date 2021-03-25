package com.chauncy.designpattern.abstract_factory_pattern;

public class Main {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleHumanFactory(); // 男人生产线
        HumanFactory femaleHumanFactory = new FalmaleHumanFactory(); // 女人生产线


        Human blackHuman = maleHumanFactory.createBlackHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.gender();
    }
}
