package com.chauncy.designpattern.factory_method;

public class YellowRace implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人类会大笑，幸福呀!");
    }

    @Override
    public void cry() {
        System.out.println("黄种人不会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄色人有说有笑");
    }
}
