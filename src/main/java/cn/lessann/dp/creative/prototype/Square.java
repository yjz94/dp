package cn.lessann.dp.creative.prototype;

public class Square extends PrototypeShape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("PrototypeShape->Square->draw run...");
    }
}
