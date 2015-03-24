package entities;

/**
 * author Maksim Diland
 */
public interface Moveable {

    static int SOME_VALUE = 5;

    void moveForward(int distance);

    void moveBack(int distance);

    void moveLeft(int distance);

    void moveRight(int distance);

}
