package cn.lessann.dp.creative.singleton;

/**
 * 单例模式
 * 懒汉模式
 * 线程安全
 */
public class LazySingletonObject2 {
    public static LazySingletonObject2 singletonObject;

    public LazySingletonObject2() {
    }

    public static synchronized LazySingletonObject2 getInstance() {
        if (singletonObject == null) {
            singletonObject = new LazySingletonObject2();
        }
        return singletonObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
