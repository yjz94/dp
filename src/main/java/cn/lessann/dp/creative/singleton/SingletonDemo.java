package cn.lessann.dp.creative.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage();
    }
}
