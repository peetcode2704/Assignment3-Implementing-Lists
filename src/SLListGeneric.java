public class SLListGeneric<T> {
    private SLNodeGeneric<T> head;

    public SLListGeneric() {
        this.head = null;
    }

    public void addy(T obj) {
        SLNodeGeneric<T> newNode = new SLNodeGeneric<>(obj);
        if (head == null) {
            head = newNode;
        } else {
            SLNodeGeneric<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removey(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNodeGeneric<T> current = head;

        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Out of range.");
            return;
        }

        current.next = current.next.next;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "The list is empty.";
        }

        String result = "";
        SLNodeGeneric<T> current = head;
        while (current != null) {
            result += current.obj.toString() + "\n";
            current = current.next;
        }
        //print to console
        System.out.println(result);
        return result;
    }

}
