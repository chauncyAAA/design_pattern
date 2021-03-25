package com.chauncy.designpattern.abstract_factory_pattern;

public abstract class AbstractYellowHuman implements Human{
    public void laugh() {
        System.out.println("黄色人类会大笑，幸福呀!");
    }

    public void cry() {
        System.out.println("黄种人不会哭");
    }


    public void talk() {
        System.out.println("黄色人有说有笑");
    }
}
