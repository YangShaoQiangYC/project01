package com.test.idea;

/**
 * @author yangshaoqiang
 * @create 2019-02-16 12:43
 */
public class TemplateTest {
    private int num1;
    private static int num2;

    // 模板一:psvm
    public static void main(String[] args) {
        method();
        eat("yangshaoqiang");
    }

    public static void method() {
        System.out.println("hello!");
    }

    //定义一个吃饭的方法
    public static void eat(String name) {
        System.out.println("测试方法！");
        System.out.println("name = [" + name + "]");
        System.out.println("TemplateTest.eat");
        System.out.println("name = [" + name + "]");
        int num1 = 10;
        num2 = 20;
        String name2 = "yangshaoqiang";

        System.out.println("num2 = " + num2);
        System.out.println(num1);
        System.out.println(num2);

        //模板三：fori
        String[] arr = new String[]{"tom", "hanmeimei", "jerry", "lilei"};
        String[] arr2 = new String[]{"tom", "hanmeimei", "jerry", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public void testUpdate(){

    }

    /**
     * 客户的id
     */
     private int id;
     
     /**
      * 客户的姓名
      */
      private String name;
      

}

