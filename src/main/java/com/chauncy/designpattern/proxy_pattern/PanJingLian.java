package com.chauncy.designpattern.proxy_pattern;

public class PanJingLian implements KindWomen {
    @Override
    public void makeEyeWIthMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在玩耍");
    }
}
