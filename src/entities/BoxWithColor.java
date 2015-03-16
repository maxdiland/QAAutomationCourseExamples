package entities;

/**
 * author Maksim Diland
 */
public class BoxWithColor extends Box {
    private String color;

    public BoxWithColor(float width, float height, float depth, float weight, String color) {
        super(width, height, depth, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
