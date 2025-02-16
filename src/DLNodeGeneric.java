public class DLNodeGeneric<T> {
    T obj;
    DLNodeGeneric<T> next;
    DLNodeGeneric<T> prev;

    public DLNodeGeneric(T data) {
        this.obj = data;
        this.next = null;
        this.prev = null;
    }
}
