package cn.lessann.dp.creative.factory.impl;

import cn.lessann.dp.creative.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw...");
    }
}
