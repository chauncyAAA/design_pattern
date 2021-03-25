package com.chauncy.designpattern.factory_method;

public class ColoredHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人大笑会露大白牙");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
