package com.sinda.java;

import java.io.File;
import java.io.FileFilter;

/**
 * @author sinda
 * @date 2020/2/28 - 下午 10:00
 */

//遍历文件
public class Traverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f = new File("C:/Users/50769/Desktop/");
        meth1(f);
        System.out.println("method1 ok");
        meth2(f);
        System.out.println("method2 ok");
        meth3(f);
        System.out.println("method3 ok");

    }

    private static void meth3(File f) {
        // 方法:3：利用文件构造器
        File[] file = f.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".js");
//                return true;
            }
        });
        for (File t : file) {
            System.out.println(t);
        }

    }

    private static void meth2(File f) {
        // 方法2：采用listfile（）方法
        File[] file = f.listFiles();
        for (File t : file) {
            if (t.getName().toLowerCase().endsWith(".js")) {
                System.out.println(t.getName());
            }
        }
    }

    public static void meth1(File f) {
//  方法1：传统
        String fileList[] = f.list(); // 调用不带参数的list()方法
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].length() - 4 > 0) {
//    常规字符判断
                int t = fileList[i].length() - 3;
                String tp = fileList[i].substring(t,fileList[i].length());
                if (tp.toLowerCase().equalsIgnoreCase(".js")){
                    System.out.println(fileList[i]+"\t");
                }
            }
        }
    }
}