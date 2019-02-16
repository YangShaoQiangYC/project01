package com.test.idea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    private static final int INITIAL_SIZE = 10;
    private int age;
    private String name;

    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!!");
        System.out.println("HelloWorld!!!");
        System.out.println("HelloWorld!!!!");
        ArrayList list = new ArrayList();
        Date date = new Date();
        Date date2 = new Date();
        list.add(0, 123);
        System.out.println(list);

    }

    public void method(){

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
