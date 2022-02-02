package cn.lessann.dp.creative.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, PrototypeShape> shapeMap = new Hashtable<>();

    public static PrototypeShape getShape(String shapeId) {
        PrototypeShape cachedShape = shapeMap.get(shapeId);
        return (PrototypeShape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
