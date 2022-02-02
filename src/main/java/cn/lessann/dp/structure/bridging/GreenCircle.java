package cn.lessann.dp.structure.bridging;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int x, int y) {
        System.out.println("Drawing Circle[ color: green, x: " + x + ", y:" + y + "]");
    }
}
