package com.chauncy.designpattern.abstract_factory_pattern;

public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void gender() {
        System.out.println("该白种人的性别为男....");
    }
}
