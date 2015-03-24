package entities;

/**
 * author Maksim Diland
 */
public class Box implements Cloneable {
    private float width;
    private float height;
    private float depth;
    private float weight;

    public Box() {
//        System.out.println("Box's constructor was called");
    }

    public Box(float width, float height, float depth, float weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }


    public final float calculateVolume() {
        float volume = width * height * depth;
        return volume;
    }

    public float calculateVolume(int coef) {
        return width * height * depth * coef;
    }

    public void setWidth(float value) {
        width = value;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box (width: " + width + ", height: " + height + ", depth: " + depth + ", weight: " + weight + ")";
    }

    @Override
    public boolean equals(Object otherBox) {
        if (this == otherBox) {
            return true;
        }

        if ( !(otherBox instanceof Box) ) {
            return false;
        }

        Box castedBox = (Box) otherBox;
        if (width == castedBox.getWidth()
                && height == castedBox.getHeight()
                && depth == castedBox.getDepth()
                && weight == castedBox.getWeight() ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) (weight * height * depth * weight);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    модификатор доступа [ключевые слова (static)] возвращаемыйТип имяМетода(аргументы) {

    }
    */
}
