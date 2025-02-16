
public class SLList {
    private SLNode head;

    // Constructor: Creates an empty list
    public SLList() {
        this.head = null;
    }

    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
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

        SLNode current = head;

        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }
        current.next = current.next.next;
    }

    public String toString() {
        String result = "";
        SLNode current = head;
        while (current != null) {
            result += current.song.toString() + "\n";
            current = current.next;
        }
        return result;
    }



}
