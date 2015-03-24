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

    @Override
    public String toString() {
        return  "Box (width: " + getWidth() + ", height: " + getHeight() + ", depth: "
                + getDepth() + ", weight: " + getWeight() + "color: "  + color + ")";
    }

//    @Override
//    public final float calculateVolume() {
//        return 0;
//    }

    @Override
    public int hashCode() {
        return super.hashCode() * color.hashCode();
    }
}
