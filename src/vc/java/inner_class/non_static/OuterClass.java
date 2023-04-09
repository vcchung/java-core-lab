package vc.java.inner_class.non_static;

public class OuterClass {
    private int outerClassPrivateField=10;
    public void outerMethod(){
        //Cannot access inner private field from outer class
//        System.out.println(innerPrivateField);
    }
    public class NonStaticInnerClass{
        private int innerPrivateField=11;
        public NonStaticInnerClass(){
            System.out.println("Constructor for NonStaticInnerClass");
        }
        public void innerMethod(){
            System.out.println("outerClassPrivateField is "+outerClassPrivateField);
        }
    }

}
