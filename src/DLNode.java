public class DLNode {
    Song song;
    DLNode next;
    DLNode prev;

    public DLNode(Song data) {
        this.song = data;
        this.next = null;
        this.prev = null;
    }
}
