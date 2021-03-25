package com.chauncy.designpattern.abstract_factory_pattern;

public class BlackMaleHuman extends AbstractBlackHuman {
    @Override
    public void gender() {
        System.out.println("该黑种人的性别为男...");
    }
}
