package entities;

/**
 * author Maksim Diland
 */
public class MathUtil {

    private MathUtil() {
    }

    public static float Pi = 3.14151F;

    public static int calculateSum(int ... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public static float getCirclePerimeter(float radius) {
        return radius * 2 * Pi;
    }
}
