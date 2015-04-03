package entities;

/**
 * author Maksim Diland
 */
public class SimpleContainer<T> {
    private Object object;

    public void put(T objectToPut) {
        object = objectToPut;
    }

    public T get() {
        return (T) object;
    }
}
