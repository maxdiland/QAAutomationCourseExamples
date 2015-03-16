package entities;

/**
 * author Maksim Diland
 */
public class Box {
    private float width;
    private float height;
    private float depth;
    private float weight;

//    public Box() {
//        System.out.println("Box's constructor was called");
//    }

    public Box(float width, float height, float depth, float weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }



    public float calculateVolume() {
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

    /*
    модификатор доступа [ключевые слова (static)] возвращаемыйТип имяМетода(аргументы) {

    }
    */
}
