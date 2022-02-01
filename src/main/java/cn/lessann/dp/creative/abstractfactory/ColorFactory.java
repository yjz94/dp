package cn.lessann.dp.creative.abstractfactory;

import cn.lessann.dp.creative.abstractfactory.impl.Blue;
import cn.lessann.dp.creative.abstractfactory.impl.Green;
import cn.lessann.dp.creative.abstractfactory.impl.Red;
import cn.lessann.dp.creative.factory.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            case "Red":
                return new Red();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
