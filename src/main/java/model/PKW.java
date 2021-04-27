package model;

public class PKW implements AbleToMove {
    @Override
    public void move(String distance) {
        System.out.println("driven: " + distance);
    }
}
