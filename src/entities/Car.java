package entities;

/**
 * author Maksim Diland
 */
public class Car implements Moveable, Cloneable {

    public void playMusic() {

    }

    @Override
    public void moveForward(int distance) {
        System.out.println("moved forward: " + distance);
    }

    @Override
    public void moveBack(int distance) {
        System.out.println("moved back: " + distance);
    }

    @Override
    public void moveLeft(int distance) {
        System.out.println("moved left: " + distance);
    }

    @Override
    public void moveRight(int distance) {
        System.out.println("moved right: " + distance);
    }
}
