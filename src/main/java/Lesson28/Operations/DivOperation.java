package Lesson28.Operations;

import Lesson28.Interfaces.Operation;

public class DivOperation implements Operation {

    private double num1, num2;
    private double result;

    public DivOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void execute() {
        result = num1 / num2;

    }

    @Override
    public double getResult() {
        return this.result;
    }
}
