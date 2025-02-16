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

}