package com.chauncy.designpattern.multi_cases;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor = 2; //最多只能有连个皇帝
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);//皇帝名
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); // 皇帝容器
    private static int countNumEmperor = 0; // 当前皇帝

    static { // 创建两个皇帝，放入ArrayList
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor() { // 不能使用默认构造方法创建
    }

    public Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() { // 随机返回一个皇帝
        Random random = new Random();
        countNumEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumEmperor);
    }
    public static Emperor getInstance(int countNumEmperor) { // 返回一个指定皇帝
        return (Emperor) emperorList.get(countNumEmperor);
    }
    public void emperorINfo() { // 获取皇帝信息
        System.out.println(emperorInfoList.get(countNumEmperor));
    }

    public static void main(String[] args) {
        int ministerNum = 10;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            //Emperor emperor = Emperor.getInstance(1);
            System.out.print("第" + (i + 1) + "个大臣参拜的是:");
            emperor.emperorINfo();
            System.out.println();
        }
    }
}
