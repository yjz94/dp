package cn.lessann.dp.creative.abstractfactory;

public class FactoryProduce {
    public static AbstractFactory getFactory(String choice) {
        if ("Shape".equals(choice)) {
            return new ShapeFactory();
        } else if ("Color".equals(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
