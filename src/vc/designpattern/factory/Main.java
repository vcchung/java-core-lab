package vc.designpattern.factory;

public class Main {
    public static void main(String[] args){
        Ball ball=BallFactory.createBall(BallType.BASKETBALL);
        ball.play();
    }
}
