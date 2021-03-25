package com.chauncy.designpattern.factory_method;

public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("白种人会大笑");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节!");
    }
}
