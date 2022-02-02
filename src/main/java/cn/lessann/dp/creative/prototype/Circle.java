package cn.lessann.dp.creative.prototype;

public class Circle extends PrototypeShape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("PrototypeShape->Circle->draw run...");
    }
}
