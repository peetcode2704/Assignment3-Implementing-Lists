import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    private AList aList;
    private SLList slList;
    private DLList dlList;
    private Song song1, song2, song3,song4;


    @BeforeEach
    public void setUp() {
        aList = new AList();
        slList = new SLList();
        dlList = new DLList();

        song1 = new Song("Despacito", "Peter", 3.2);
        song2 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        song3 = new Song("Guli guli", "YoungPeet", 99.9);
        song4 = new Song("Never gonna give you up", "Rick Astley", 3.33);
    }
    @Test
    public void aListAdd1() {
        aList.addy(song1);
        assertTrue(aList.toString().contains("Despacito"));
    }

    @Test
    public void slListAdd1() {
        slList.addy(song1);
        assertTrue(slList.toString().contains("Despacito"));
    }

    @Test
    public void dlListAdd1() {
        dlList.addy(song1);
        assertTrue(dlList.toString().contains("Despacito"));
    }

    @Test
    public void aListAddMultiple() {
        aList.addy(song1);
        aList.addy(song2);
        aList.addy(song3);
        aList.addy(song4);
        assertTrue(aList.toString().contains("Despacito"));
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(aList.toString().contains("Guli guli"));
        assertTrue(aList.toString().contains("Never gonna give you up"));
    }

    @Test
    public void slListAddMultiple() {
        slList.addy(song1);
        slList.addy(song2);
        slList.addy(song3);
        slList.addy(song4);
        assertTrue(slList.toString().contains("Despacito"));
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(slList.toString().contains("Guli guli"));
        assertTrue(slList.toString().contains("Never gonna give you up"));
    }

    @Test
    public void dlListAddMultiple() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.addy(song4);
        assertTrue(dlList.toString().contains("Despacito"));
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(dlList.toString().contains("Guli guli"));
        assertTrue(dlList.toString().contains("Never gonna give you up"));
    }

    // Test for removing songs
    @Test
    public void aListRemoveFirst() {
        aList.addy(song1);
        aList.addy(song2);
        aList.addy(song3);
        aList.addy(song4);
        aList.removy(0); // Remove the first song (Despacito)
        assertFalse(aList.toString().contains("Despacito"));
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void slListRemoveFirst() {
        slList.addy(song1);
        slList.addy(song2);
        slList.addy(song3);
        slList.addy(song4);
        slList.removy(0); // Remove the first song (Despacito)
        assertFalse(slList.toString().contains("Despacito"));
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void dlListRemoveFirst() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.addy(song4);
        dlList.removy(0); // Remove the first song (Despacito)
        assertFalse(dlList.toString().contains("Despacito"));
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void aListRemoveLast() {
        aList.addy(song1);
        aList.addy(song2);
        aList.addy(song3);
        aList.addy(song4);
        aList.removy(3); // Remove the last song (Never gonna give you up)
        assertFalse(aList.toString().contains("Never gonna give you up"));
        assertTrue(aList.toString().contains("Guli guli"));
    }

    @Test
    public void slListRemoveLast() {
        slList.addy(song1);
        slList.addy(song2);
        slList.addy(song3);
        slList.addy(song4);
        slList.removy(3); // Remove the last song (Never gonna give you up)
        assertFalse(slList.toString().contains("Never gonna give you up"));
        assertTrue(slList.toString().contains("Guli guli"));
    }

    @Test
    public void dlListRemoveLast() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.addy(song4);
        dlList.removy(3); // Remove the last song (Never gonna give you up)
        assertFalse(dlList.toString().contains("Never gonna give you up"));
        assertTrue(dlList.toString().contains("Guli guli"));
    }

    @Test
    public void aListRemoveMiddle() {
        aList.addy(song1);
        aList.addy(song2);
        aList.addy(song3);
        aList.addy(song4);
        aList.removy(2); // Remove the middle song (Guli guli)
        assertFalse(aList.toString().contains("Guli guli"));
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void slListRemoveMiddle() {
        slList.addy(song1);
        slList.addy(song2);
        slList.addy(song3);
        slList.addy(song4);
        slList.removy(2); // Remove the middle song (Guli guli)
        assertFalse(slList.toString().contains("Guli guli"));
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void dlListRemoveMiddle() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.addy(song4);
        dlList.removy(2); // Remove the middle song (Guli guli)
        assertFalse(dlList.toString().contains("Guli guli"));
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
    }

}