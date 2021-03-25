package com.chauncy.designpattern.factory_method;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HumanFactoryAuto {
    static Human human = null; //定义一个类型的人类
    private static HashMap<String,Human> humans = new HashMap<String,Human>();
    // 指定人种创建
    public static Human createHuman(Class c) {
        try {
            if (humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
            }else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(),human);
            }
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误!");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到!");
            e.printStackTrace();
        }
        return human;
    }
    // 随机创建人种
    public static Human createHuman() {
        Human human = null; //定义一个类型的人类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }

    public static void main(String[] args) {
        for (int i =0;i < 100;i++){
            System.out.println("随机产生人类"+ i);
            Human human = HumanFactoryAuto.createHuman();
            human.cry();
            human.talk();
        }
    }

}
