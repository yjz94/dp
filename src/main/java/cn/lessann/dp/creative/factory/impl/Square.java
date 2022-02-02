package cn.lessann.dp.creative.factory.impl;

import cn.lessann.dp.creative.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw...");
    }
}
