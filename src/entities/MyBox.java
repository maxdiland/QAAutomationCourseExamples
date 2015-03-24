package entities;

/**
 * author Maksim Diland
 */
public final class MyBox {

    private final double width;
    private final double height;
    private final double depth;

    public MyBox(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public MyBox() {
        width = 10;
        height = 10;
        depth = 10;
    }

}

//class SuperBox extends MyBox {
//
//}