package cn.lessann.dp.creative.abstractfactory.impl;

import cn.lessann.dp.creative.abstractfactory.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue fill...");
    }
}
