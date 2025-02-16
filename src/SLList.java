
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

    public void removy(int pos) {
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
    @Override
    public String toString() {
        if (head == null) {
            return "The list is empty.";
        }

        String result = "";
        SLNode current = head;
        while (current != null) {
            result += current.song.toString() + "\n";
            current = current.next;
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        SLList playlist2 = new SLList();

        Song song1 = new Song("Despacito", "Peter",3.2);
        Song song2 = new Song("El Pibe De Mi Barrio","Dr. Krapula",2.47);
        Song song3 = new Song("Guli guli","YoungPeet",99.9);
        playlist2.addy(song1);
        playlist2.addy(song2);
        playlist2.addy(song3);

        playlist2.toString();

        //System.out.println(playlist);

        playlist2.removy(1);
        //System.out.println(playlist);
    }

}
