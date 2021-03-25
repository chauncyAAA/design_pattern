package com.chauncy.designpattern.abstract_factory_pattern;

public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void gender() {
        System.out.println("该黄种人的性别为男...");
    }
}
