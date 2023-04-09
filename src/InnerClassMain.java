public class InnerClassMain {
    public static void main(String[] args){
        OuterClass outerClass=new OuterClass();
        OuterClass.NonStaticInnerClass innerClass=outerClass.new NonStaticInnerClass();
        innerClass.innerMethod();
    }
}

