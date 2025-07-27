package com.luruoyang;

import java.io.Console;
import java.io.File;
import java.util.Scanner;

public class TypeCast {
  public static void main(String[] args) throws Exception {
    /*
    类型转换
    自动类型转换(隐式类型转换)
    强制类型转换(显式类型转换)
    */

    byte b = 12;
    b = (byte) (b + 1);

    short s = 12;
    s = (short) (s + 1);

    char c = 'c';
    c = (char) (c + 1);

    int i = 100;
    i = (int) (i + 1L);

    /*
    算术运算符
     */
    double num1 = 24.5;
    int num2 = 5;
    int num3 = 8;
    int num4 = 10;
    System.out.println(num1 + num2); // 29.5
    System.out.println(num1 - num2); // 19.5
    System.out.println(num1 * num2); // 122.5
    System.out.println(num1 / num2); // 4.9
    System.out.println(num1 % num2); // 4.5
    System.out.println(num2 & num3); // 0
    System.out.println(num2 | num3); // 13

    /*
    一元运算符
     */
    int date = 100;
    System.out.println(++date); // 101
    System.out.println(--date); // 100
    System.out.println(date++); // 100
    System.out.println(date--); // 101

    /*
    赋值运算符
     */
    System.out.println(num1 += num2); // 29.5
    System.out.println(num1 -= num2); // 24.5
    System.out.println(num1 *= num2); // 122.5
    System.out.println(num1 /= num2); // 24.5
    System.out.println(num1 %= num2); // 4.5
    System.out.println(num2 &= num3); // 0
    System.out.println(num2 |= num3); // 8

    /*
    比较运算符
    */
    int height = 200, width = 100;
    System.out.println(height > width);
    System.out.println(height >= width);
    System.out.println(height < width);
    System.out.println(height <= width);
    System.out.println(height == width);
    System.out.println(height != width);

    /*
    逻辑运算符
     */
    boolean male = true, female = false;
    System.out.println(male & female);
    System.out.println(male | female);
    System.out.println(!male);
    System.out.println(male && female); // 短路与、惰性与
    System.out.println(male || female); // 短路或、惰性或

    /*
    三元运算符
     */
    System.out.println(male ? "male" : "female");
    System.out.println(true ? "true" : "false");

    /*
    Scanner类
    */

    Scanner sc = new Scanner(new File("java-01-quickstart/quickstart.txt"));
    while (sc.hasNext()) {
      System.out.println(sc.next());
    }

    sc = new Scanner(System.in);
    String input;
    while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
      System.out.println(input);
    }
    /*
    案例: 求三个数中的最小值
    */
    int m = 10, n = 5, j = 15;
    System.out.println(m + "," + n + "," + j);
    int min = m <= n ? m : n <= j ? n : j;
    System.out.println(min);

    /*
    控制台录入密码
    */

    // java -jar .\java-01-quickstart\target\java-01-quickstart-21-RELEASE.jar
    System.out.println("请输入密码:");
    Console console = System.console();
    char[] password = console.readPassword();
    System.out.println(password);
  }
}
