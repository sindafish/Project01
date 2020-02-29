package com.sinda.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {

        //region Description
        getlist();

//        method();
    }

    public static void getlist() {
        System.out.println("Hello World");
        System.out.println("Hello World");

        ArrayList list = new ArrayList();
        //endregion

        Date date = new Date();

        list.add(0, 123);
        list.add(1, 2);

        System.out.println(list);
        System.out.println("list = " + list);
    }

    public static void method() {

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
