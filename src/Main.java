//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AList playList = new AList();

        Song song1 = new Song("Despacito", "Peter",3.2);
        Song song2 = new Song("El Pibe De Mi Barrio","Dr. Krapula",2.47);

        playList.addy(song1);
        playList.addy(song2);
        System.out.println(playList);
        playList.toString();
    }
}