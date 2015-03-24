package entities;

/**
 * author Maksim Diland
 */
public class BubbleArraySorter extends AbstractArraySorter {

    public void sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapElements(array, i, i + 1);
                }
            }
        }
    }

    @Override
    public String getSortingName() {
        return "Bubble sorter";
    }

    public void doSomething() {}
}
