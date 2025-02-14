public class AList {
    private int maxSize;
    private int size;
    private Song[] songs;

    public AList() {
        maxSize = 10;
        size = 0;
        songs = new Song[maxSize];
    }

    public void addy(Song p) {
        songs[size] = p;
        if (size > maxSize) {
            maxSize *= 2;
            Song[] newSong = new Song[maxSize];
            for (int i = 0; i < newSong.length; i++) {
                newSong[i] = songs[i];
            }
        }
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }
        for (int i = pos; i < size - 1; i++) {
            songs[i] = songs[i + 1]; //Shift the elements
        }
        songs[size - 1] = null;
        size--;
    }

    public String toString() {
        for (int i = 0; i < size; i++) {
            System.out.println(songs[i]);
        }
        return "Playlist is empty right now. Add more songs!";
    }
}

