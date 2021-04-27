package model;

public class PKW implements ableToMove{
    @Override
    public void move(String distance) {
        System.out.println("driven: " + distance);
    }
}
