package com.oxysa.anonymousInnerClass;

//测试类 测试匿名内部类的使用场景
//场景一：对 对象方法(成员方法)仅调用一次的时候
public class AnimalTest01 {
    public static void main(String[] args) {
        //需求调用Animal的eat方法
        //方式一：多态 创建抽象类Animal子类Cat对象
        Animal cat = new Cat();
        cat.eat();
        System.out.println("-------------------------------");

        //方式二：通过匿名对象实想
        new Cat().eat();
        System.out.println("-------------------------------");

        //方式三：通过匿名内部类实现
        new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类的形式创建Animal的子类对象，吃饭饭！！");
            }
        }.eat();
        System.out.println("-----------------------");

        //父类引用指向子类对象，多态
        Animal an1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类 多态的形式创建对象 吃饭");
            }
        };
        an1.eat();


    }
}
