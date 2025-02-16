public class AListGeneric<T> {
    private int maxSize;
    private int size;
    private T[] obj;

    public AListGeneric() {
        maxSize = 10;
        size = 0;
        obj = (T[]) new Object[maxSize];
    }

    public void addy(T element) {
        if (size >= maxSize) {
            maxSize *= 2;
            T[] newElements = (T[]) new Object[maxSize];

            // Copy elements from the old array to the new one
            for (int i = 0; i < size; i++) {
                newElements[i] = obj[i];
            }
            obj = newElements;  // Point to the new array
        }
        obj[size] = element;
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }

        for (int i = pos; i < size - 1; i++) {
            obj[i] = obj[i + 1]; // Shift elements to the left
        }
        obj[size - 1] = null;
        size--;
    }

    public String toString() {
        if (size == 0) {
            return "Playlist is empty right now. Add more songs!";
        }
        String result = "";
        for (int i = 0; i < size; i++) {
            result += obj[i].toString() + "\n";
            //Test in Console
            System.out.println(result);
        }
        return result;
    }
}
