package com.chauncy.designpattern.singleton_pattern;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class S7 {
    private S7() {
    }

    // 静态内部类，加载外部类不会加载内部类
    private static class S7Holder{
        private static final S7 INSTANCE = new S7();
    }

    public static S7 getInstance(){
        return S7Holder.INSTANCE;
    }
    public void m() {
        System.out.println("m");
    }
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->
                    System.out.println(S7.getInstance().hashCode())
            ).start();
        }
    }
}
