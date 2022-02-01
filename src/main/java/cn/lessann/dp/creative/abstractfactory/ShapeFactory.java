package cn.lessann.dp.creative.abstractfactory;

import cn.lessann.dp.creative.factory.Shape;
import cn.lessann.dp.creative.factory.impl.Circle;
import cn.lessann.dp.creative.factory.impl.Rectangle;
import cn.lessann.dp.creative.factory.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
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
