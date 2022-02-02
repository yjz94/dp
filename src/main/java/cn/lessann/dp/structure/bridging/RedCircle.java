package cn.lessann.dp.structure.bridging;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y) {
        System.out.println("Drawing Circle[ color: red, x: " + x + ", y:" + y + "]");
    }
}
