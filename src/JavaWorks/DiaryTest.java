package JavaWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void diaryExistsTest(){
        Diary diary = new Diary("Grace", "1234");
        assertNotNull(diary);
    }
    @Test
    public void diaryCanIsNotLockedTest(){
        Diary diary = new Diary("Grace", "1234");
        assertFalse(diary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        Diary diary = new Diary("Grace", "1234");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void diaryCanBeUnlockedTest(){
        Diary diary = new Diary("Grace", "1234");

        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlockDiary();
        assertFalse(diary.isLocked());
    }
    @Test
    public void entryCanBeCreatedTest(){
        Diary diary = new Diary("Grace", "1234");
        diary.isLocked();
        diary.unlockDiary();
        diary.createEntry("Sunday blessings", "Today was a great day. I went to church and it felt good");
        diary.findEntryById(1);
        assertEquals("Sunday blessings", diary.findEntryById(1).getTitle());
        assertEquals("Today was a great day. I went to church and it felt good", diary.findEntryById(1).getBody());
    }
    @Test
    public void entryCanBeUpdatedTest(){
        Diary diary = new Diary("Grace", "1234");
        diary.isLocked();
        diary.unlockDiary();
        diary.createEntry("Sunday blessings", "Today was a great day.I went to church and it felt good");
        diary.updateEntry(1, "Christmas", "I really love christmas");
        assertEquals(new Entry(1, "Christmas", "I really love christmas").getEntry(),diary.findEntryById(1).getEntry());
           }
           @Test
    public void diaryEntryCanBeDeletedTest(){
               Diary diary = new Diary("Grace", "1234");
               diary.isLocked();
               diary.unlockDiary();
               diary.createEntry("Sunday blessings", "Today was a great day.I went to church and it felt good");
               diary.findEntryById(1);
               assertEquals("Sunday blessings", diary.findEntryById(1).getTitle());
               diary.deleteEntry(1);
           }
    }
