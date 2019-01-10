package hr.unipu.zadace.zad5;

import java.text.DecimalFormat;

public class Multiplication extends Operation {

    public Multiplication(double x, double y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public double getFinalResult() {
        double result = x * y;
        DecimalFormat format = new DecimalFormat("##.00");
        return Double.parseDouble(format.format(result));
    }

}


