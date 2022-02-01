package cn.lessann.dp.creative.abstractfactory;

import cn.lessann.dp.creative.factory.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}