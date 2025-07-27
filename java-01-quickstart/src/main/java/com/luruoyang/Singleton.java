package com.luruoyang;

/**
 * 单例模式: 限制类实例化对象的个数
 * 饿汉式
 *
 * @author luruoyang
 */
public class Singleton {
  /* 私有类变量(常量) */
  private static final Singleton INSTANCE = new Singleton();

  /* 私有构造 */
  private Singleton() {
  }

  /* 公有 static 工厂方法 */
  public static Singleton getInstance() {
    return INSTANCE;
  }
}
