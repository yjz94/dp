package cn.lessann.dp.creative.build;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
