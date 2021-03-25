package com.chauncy.designpattern.singleton_pattern;
/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum S8 {
    INSTANCE;
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->
                    System.out.println(S8.INSTANCE.hashCode())
            ).start();
        }
    }
}
