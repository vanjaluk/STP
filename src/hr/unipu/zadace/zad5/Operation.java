package hr.unipu.zadace.zad5;

abstract class Operation implements IResult {
    protected double x;
    protected double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}