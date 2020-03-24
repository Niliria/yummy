package com.oxysa.homework;

import java.util.Hashtable;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-14 20:07
 */
class Base {

    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put("100","aaa");
        hashtable.put("200","bbb");
        hashtable.put("300","ccc");

        System.out.println(hashtable.get("300").toString()
                + hashtable.get("200").toString()
                + hashtable.get("100").toString());
    }


}



