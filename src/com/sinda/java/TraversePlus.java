package com.sinda.java;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author sinda
 * @date 2020/2/28 - 下午 10:12
 */

//遍历文件进阶版
public class TraversePlus {
    public static void main(String[] args) throws IOException {
        Path start = FileSystems.getDefault().getPath("C:/Users/50769/Desktop/");
        Files.walk(start).filter(path -> path.toFile().isFile())
                .filter(path -> path.toString().endsWith(".js"))
                .forEach(System.out::println);
    }
}
