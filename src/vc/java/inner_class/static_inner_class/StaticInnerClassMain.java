package vc.java.inner_class.static_inner_class;

public class StaticInnerClassMain {
    public static void main(String[] args){
        Calculator calculator=new Calculator();
        System.out.println(calculator.calculate(Calculator.Operation.ADD));
    }


}
