package cn.lessann.dp.creative.factory;

import cn.lessann.dp.creative.factory.impl.Circle;
import cn.lessann.dp.creative.factory.impl.Rectangle;
import cn.lessann.dp.creative.factory.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
