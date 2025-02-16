public class SLNodeGeneric<T> {
    T obj;
    SLNodeGeneric<T> next;

    // Constructor to create a new node with the element and next pointer set to null
    public SLNodeGeneric(T obj) {
        this.obj = obj;
        this.next = null;
    }
}
