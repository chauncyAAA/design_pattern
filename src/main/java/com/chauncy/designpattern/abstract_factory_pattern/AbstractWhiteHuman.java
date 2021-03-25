package com.chauncy.designpattern.abstract_factory_pattern;

public abstract class AbstractWhiteHuman implements Human{
    public void laugh() {
        System.out.println("白色人类会哭");
    }

    public void cry() {
        System.out.println("白种人会大笑");
    }

    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节!");
    }
}
