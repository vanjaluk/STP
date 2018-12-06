package hr.unipu.zadace.zad5;

public class Addition extends Operation {
    private double x;
    private double y;

    public Addition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void setNumber(double x, double y) {
        super.setNumber(x, y);
    }

    public boolean checkIfNumber() {
        return Boolean.parseBoolean(null);
    }

    @Override
    public double getFinalResult() {
        this.x = getX();
        this.y = getY();
        double result = x +y;

        return result;
    }

}