package cn.lessann.dp.creative.singleton;

/**
 * 饿汉模式
 */
public class SingletonObject {
    public static SingletonObject singletonObject = new SingletonObject();

    public SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
