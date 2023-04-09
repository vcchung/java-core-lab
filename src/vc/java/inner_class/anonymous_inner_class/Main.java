package vc.java.inner_class.anonymous_inner_class;

public class Main {
    public static void main(String[] args){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("running here");
            }
        };
        //call start instead of run to start a new thread
        new Thread(runnable).start();
    }
}
