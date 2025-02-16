public class DLListGeneric<T> {
    private DLNodeGeneric<T> head;
    private DLNodeGeneric<T> tail;

    public DLListGeneric() {
        this.head = null;
        this.tail = null;
    }

    public void addy(T obj) {
        DLNodeGeneric<T> newNode = new DLNodeGeneric<>(obj);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removey(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        // Remove the head node
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DLNodeGeneric<T> current = head;
        for (int i = 0; current != null && i < pos; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Out of bounds error.");
            return;
        }

        if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "The list is empty.";
        }

        String result = "";
        DLNodeGeneric<T> current = head;
        while (current != null) {
            result += current.obj.toString() + "\n";
            current = current.next;
        }
        //print to console
        System.out.println(result);
        return result;
    }

}
