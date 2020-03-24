package com.oxysa.anonymousInnerClass;

//场景二：匿名内部类可以作为方法的实参
public class AnimalTest02 {
    public static void main(String[] args) {
        //方式一：创建抽象类子类对象
        Animal cat = new Cat();
        show(cat);
        System.out.println("--------------------");

        //方式二：匿名对象
        show(new Cat());
        System.out.println("==================");

        //方式三匿名内部类实现
        show(new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类，吃饭");
            }
        });

    }

    //定义show()方法
    public static void show(Animal an) {
        an.eat();
    }

}
