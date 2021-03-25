package com.chauncy.designpattern.singleton_pattern;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class S2 {
    private static final S2 INSTANCE;

    static { // 在静态代码块中创建对象
        INSTANCE = new S2();
    }

    private S2() {
    }

    public void m() {
        System.out.println("m");
    }

    public static S2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        S2 s1 = S2.getInstance();
        S2 s2 = S2.getInstance();
        System.out.println(s1 == s2);
    }
}
