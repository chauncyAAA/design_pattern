package com.chauncy.designpattern.abstract_factory_pattern;

public class WhiteFemaleHuman extends AbstractWhiteHuman {
    @Override
    public void gender() {
        System.out.println("该白种人的性别为女....");
    }
}
