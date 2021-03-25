package com.chauncy.designpattern.singleton_pattern;
/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class S6 {
    private static S6 INSTANCE;
    private S6() {
    }

    public static S6 getInstance(){
        if (INSTANCE == null) {
            synchronized (S6.class) {
                //双重检查
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new S6();
                }
            }
        }
        return INSTANCE;
    }
    public void m() {
        System.out.println("m");
    }
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->
                    System.out.println(S6.getInstance().hashCode())
            ).start();
        }
    }
}