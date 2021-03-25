package com.chauncy.designpattern.singleton_pattern;
/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class S5 {
    private static S5 INSTANCE;
    private S5() {
    }

    public static S5 getInstance(){
        if (INSTANCE == null) {
            synchronized (S5.class) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new S5();
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
                    System.out.println(S5.getInstance().hashCode())
            ).start();
        }
    }
}
