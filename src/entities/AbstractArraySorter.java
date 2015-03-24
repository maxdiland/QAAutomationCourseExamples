package entities;

/**
 * author Maksim Diland
 */
public abstract class AbstractArraySorter {
    protected void swapElements(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public abstract String getSortingName();

}
