package JavaWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {
    @Test
    public void diaryCanBeAddedToTest(){
        Diaries diaries = new Diaries();
        diaries.addDairy("Grace", "1234");
        assertEquals(new Diary("Grace", "1234").getUsername(), diaries.findByUserName("Grace").getUsername());

    }
    @Test
    public void findDiaryByUserNameTest(){
        Diaries diaries = new Diaries();
        diaries.addDairy("Grace", "1234");
        diaries.findByUserName("Grace");
        assertEquals("Grace", diaries.findByUserName("Grace").getUsername());
    }
    @Test
    public void diaryCanBeDeletedTest(){
        Diaries diaries = new Diaries();
        diaries.addDairy("Grace", "1234");
        diaries.deleteDiary("Grace");
        assertThrows(IllegalArgumentException.class, ()-> {diaries.findByUserName("Grace");});
    }
}
