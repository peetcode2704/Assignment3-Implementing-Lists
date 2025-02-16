public class DLList {
    DLNode head;
    DLNode tail;

    public DLList() {
        head = null;
        tail = null;
    }

    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            DLNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }
    }
    public void removy(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DLNode current = head;
        int index = 0;
        while (current != null && index < pos) {
            current = current.next;
            index++;
        }
        if (current == null) {
            System.out.println("Out of bounds error");
            return;
        }

        //When try to remove the head node
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        }
        //When try to remove the tail node
        else if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public String toString() {
        if (head == null) {
            return "The list is empty.";
        }

        String result = "";
        DLNode current = head;
        while (current != null) {
            result += current.song.toString() + "\n";
            current = current.next;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        SLList playlist3 = new SLList();

        Song song1 = new Song("Despacito", "Peter",3.2);
        Song song2 = new Song("El Pibe De Mi Barrio","Dr. Krapula",2.47);
        Song song3 = new Song("Guli guli","YoungPeet",99.9);
        playlist3.addy(song1);
        playlist3.addy(song2);
        playlist3.addy(song3);

        playlist3.toString();

        //System.out.println(playlist3);

        playlist3.removey(1);
        //System.out.println(playlist3);
        playlist3.toString();

    }

}