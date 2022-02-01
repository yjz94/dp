package cn.lessann.dp.creative.abstractfactory.impl;

import cn.lessann.dp.creative.abstractfactory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green fill...");
    }
}
