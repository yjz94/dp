package cn.lessann.dp.creative.abstractfactory.impl;

import cn.lessann.dp.creative.abstractfactory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red fill...");
    }
}
