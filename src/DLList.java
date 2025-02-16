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





}