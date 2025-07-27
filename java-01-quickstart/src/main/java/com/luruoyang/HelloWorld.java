package com.luruoyang;

public class HelloWorld {
  public static void main(String[] args) {
    /* HelloWorld */
    System.out.println("Hello World");
    System.out.println("Hello\nWorld");

    /* 字面量 */
    System.out.println((byte) 123);
    System.out.println((short) 123);
    System.out.println(123);
    System.out.println(123L);
    System.out.println(123F);
    System.out.println(123D);
    System.out.println("s");
    System.out.println('c'); // char 类型的字面量必须有值, 不能为 ''
    System.out.println(true);
    // System.out.println(null);

    // 单行注释

    /*
    多行注释
     */

    /**
     * 文档注释
     */

    /* 变量 */
    // 声明
    int age;
    // 初始化: 第一次赋值
    age = 27;
    // 赋值
    age = age + 1;
    // 使用, 使用前必须保证有值, 否则会报错 might not have been initialized
    System.out.println(age);
    // 声明时初始化, 支持同时声明并初始化多个变量
    int num = 100;
    int count1 = 1, count2 = 2, count3 = 3;

    // 变量交换 (必会)
    int tmp = count1;
    count1 = count2;
    count2 = tmp;

    /**
     * 简单类型: 基本类型及其包装类、String类型
     */
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;

    // System.out.println(i); // Variable 'i' might not have been initialized

    Byte bytee;
    Short shortt;
    Integer integer;
    Long longg;
    Float floatt;
    Double doublee;
    Character character;

    String ss;

    // System.out.println(integer); // Variable 'integer' might not have been initialized
    // System.out.println(ss); // Variable 'ss' might not have been initialized
  }
}
