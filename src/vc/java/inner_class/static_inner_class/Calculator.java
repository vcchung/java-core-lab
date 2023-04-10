package vc.java.inner_class.static_inner_class;

public class Calculator {
    public int calculate(Operation operation){
        return Integer.MAX_VALUE;
    }

    public static enum Operation {
        ADD(0), SUBSTRACT(1), MULTIPLY(2), DIVISION(3);
        private int mode;
        Operation(int mode){
            this.mode=mode;
        }

    }
}
