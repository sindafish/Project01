package com.sinda.java;

import java.util.ArrayList;

/**
 * @author sinda
 * @date 2020/2/28 - 下午 9:05
 *
 * idea中代码模板所处的位置:setting -editor -live templates
 * postfix completion
 */
public class TemplatesTest {
    public static void main(String[] args) {

//      sout
        System.out.println("hello");
//      soutm
        System.out.println("TemplatesTest.main");

        int num1 = 1;
        int num2 = 2;
//      soutv
        System.out.println("num1 = " + num1);
//      fori
        String[] arr = new String[]{"tim", "qq", "wechat"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //list.fori
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //list.for
        for (Object o : list) {
            
        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        method();

    }
    public static void method(){

        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        
        //ifn
        if (list == null) {
            System.out.println("list == null");
        }
        //inn
        if (list != null) {
            System.out.println("list != null");
        }


    }

}
