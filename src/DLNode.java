public class DLNode {
    Song data;
    DLNode next;
    DLNode prev;

    public DLNode(Song song) {
        this.data = song;
        this.next = null;
        this.prev = null;
    }
}
