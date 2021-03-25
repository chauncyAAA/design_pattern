package com.chauncy.designpattern.singleton_pattern;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class S1 {
    private static final S1 INSTANCE = new S1();

    private S1() {
    }
    public void m() {
        System.out.println("m");
    }
    public static S1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        S1 s1 = S1.getInstance();
        S1 s2 = S1.getInstance();
        System.out.println(s1 == s2);
    }
}
