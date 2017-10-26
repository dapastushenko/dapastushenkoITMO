package Lesson7;

public class Accumulator {
    private int value;
    private final Operation operation;

    public Accumulator(int value, Operation operation) {
        this.value = value;
        this.operation = operation;
    }

    public void calculate(int arg) {
        value = operation.apply(value, arg);
    }

    public int getValue() {
        return value;
    }

}
