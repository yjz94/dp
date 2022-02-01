package cn.lessann.dp.creative.singleton;

/**
 * 单例模式
 * 懒汉模式
 * 线程不安全
 */
public class LazySingletonObject1 {
    public static LazySingletonObject1 singletonObject;

    public LazySingletonObject1() {
    }

    public static LazySingletonObject1 getInstance() {
        if (singletonObject == null) {
            singletonObject = new LazySingletonObject1();
        }
        return singletonObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
