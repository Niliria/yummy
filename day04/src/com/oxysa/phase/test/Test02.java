package com.oxysa.phase.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-14 21:56
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入饮料名：");
        String s = sc.nextLine();
        System.out.println("请投币：");
        int i = sc.nextInt();

        //创建售货机并设置机内剩余现金总额
        VendingMachine vm = new VendingMachine();
        vm.setMachine("自动贩卖机");
        vm.setResidueMoney(100.0F);

        //创建饮料列表
        HashMap<String, Float> map = new HashMap<>();
        map.put("旺仔牛奶", 4F);
        map.put("健怡可乐", 5F);
        map.put("维他柠檬茶", 6.5F);

        vm.setDrinksMenu(map);

        //买饮料
        vm.buyDrink(new Money(i,true), s);


    }
}
