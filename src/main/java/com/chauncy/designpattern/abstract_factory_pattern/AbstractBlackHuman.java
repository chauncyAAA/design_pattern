package com.chauncy.designpattern.abstract_factory_pattern;

public abstract class AbstractBlackHuman implements Human{
    public void laugh() {
        System.out.println("黑人大笑会露大白牙");
    }

    public void cry() {
        System.out.println("黑人会哭");
    }

    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
