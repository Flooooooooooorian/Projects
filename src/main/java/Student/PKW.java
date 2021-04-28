package Student;

public class PKW implements AbleToMove {
    @Override
    public void move(String distance) {
        System.out.println("driven: " + distance);
    }
}
