package com.oxysa.phase.test;

import java.util.HashMap;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-14 21:29
 */
public class VendingMachine {
    //机器名称
    private String machine;
    //饮料列表
    private HashMap<String, Float> drinksMenu;
    //机器剩余现金总额
    private float residueMoney;


    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public HashMap<String, Float> getDrinksMenu() {
        return drinksMenu;
    }

    public void setDrinksMenu(HashMap<String, Float> drinksMenu) {
        this.drinksMenu = drinksMenu;
    }

    public float getResidueMoney() {
        return residueMoney;
    }

    public void setResidueMoney(float residueMoney) {
        this.residueMoney = residueMoney;
    }


    public void buyDrink(Money m, String s) {
        //真钱价钱
        if (!m.isTureOrFalse()) {
            System.out.println("您使用的是假币");
            return;

        }
        //用真钱 但是钱不太够
        if (m.getFaceValue() < drinksMenu.get(s)) {
            System.out.println("面值不足！！");
            return;

        }

        System.out.println("找零：" + (m.getFaceValue() - drinksMenu.get(s)));
        System.out.println("机器现金总额：" + (residueMoney + drinksMenu.get(s)));
        System.out.println("在" + machine + "成功购买一瓶饮料" + s);

    }

}
