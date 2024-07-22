package Lesson28.Operations;

import Lesson28.Interfaces.Operation;

public class MulOperation implements Operation {
    private double num1;
    private double num2;

    public MulOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private double result;

    @Override
    public void execute() {
        result = num1 * num2;

    }

    @Override
    public double getResult() {
        return this.result;
    }
}
