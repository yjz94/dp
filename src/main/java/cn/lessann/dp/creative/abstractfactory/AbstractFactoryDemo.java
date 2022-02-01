package cn.lessann.dp.creative.abstractfactory;

import cn.lessann.dp.creative.factory.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProduce.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProduce.getFactory("Color");

        Color red = colorFactory.getColor("Red");
        red.fill();

    }
}
