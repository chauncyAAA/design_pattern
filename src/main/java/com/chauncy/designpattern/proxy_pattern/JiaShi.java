package com.chauncy.designpattern.proxy_pattern;

public class JiaShi implements KindWomen {
    @Override
    public void makeEyeWIthMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏在玩耍");
    }
}
