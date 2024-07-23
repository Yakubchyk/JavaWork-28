package Lesson28.model;

import lombok.Data;

@Data
public class Operation {
    private double num1;
    private double num2;
    private String type;
    private double result;


    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public Operation(double num1, double num2, String type, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }

    public Operation(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;

    }


    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", type='" + type + '\'' +
                ", result=" + result +
                '}';
    }
}
