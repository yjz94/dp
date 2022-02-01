package cn.lessann.dp.creative.singleton;

/**
 * 单例模式
 * 懒汉模式
 */
public class StaticSingletonObject {

    private static class SingletonHolder {
        public static StaticSingletonObject INSTANCE = new StaticSingletonObject();
    }

    public StaticSingletonObject() {
    }

    public static StaticSingletonObject getSingleton() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
