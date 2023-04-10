package vc.designpattern.factory;

public class BallFactory {
    public static Ball createBall(BallType type){
        switch (type){
            case BASKETBALL -> {
                return new BasketBall();
            }
            case SOCCER -> {
                return new Soccer();
            }
            default -> throw new IllegalArgumentException("not supported");
        }
    }
}


interface Ball{
    int size = 10;
    void play();
}

class BasketBall implements Ball{

    @Override
    public void play() {
        System.out.println("playing basketball");
    }
}

class Soccer implements Ball{

    @Override
    public void play() {
        System.out.println("playing soccer");
    }
}
enum BallType{
    BASKETBALL, SOCCER
}
