package cn.lessann.dp.creative.singleton;

/**
 * 单例模式
 * 懒汉模式
 * 线程安全
 */
public class DoubleLockSingletonObject {
    public static DoubleLockSingletonObject singletonObject;

    public DoubleLockSingletonObject() {
    }

    public static DoubleLockSingletonObject getSingleton() {
        if (singletonObject == null) {
            synchronized (DoubleLockSingletonObject.class) {
                if (singletonObject == null) {
                    singletonObject = new DoubleLockSingletonObject();
                }
            }
        }
        return singletonObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
