public class Song {
    private String title;
    private String artist;
    private double length;

    public Song(String title,String artist,double length) {
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    public String toString() {
        return "songName: " + title + ", artist: " + artist + ", length: " + length;
    }
}
