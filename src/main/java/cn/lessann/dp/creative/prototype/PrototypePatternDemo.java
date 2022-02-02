package cn.lessann.dp.creative.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        PrototypeShape shape = ShapeCache.getShape("1");

        shape.draw();
    }

}
