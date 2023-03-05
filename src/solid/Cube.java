package solid;

public class Cube implements Shape{

    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public double area() {
        return Math.pow(this.getA(),2) * 6;
    }
}
