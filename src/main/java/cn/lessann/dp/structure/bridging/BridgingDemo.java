package cn.lessann.dp.structure.bridging;

public class BridgingDemo {
    public static void main(String[] args) {
        Circle readCircle = new Circle(1, 2, new RedCircle());
        readCircle.draw();

    }
}
