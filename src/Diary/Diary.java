package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary{
    private String userName;
    private String password;
    private String isLocked;
    private int id;
    private List<Entry> diary = new ArrayList<>();
    private Entry entry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public boolean isLocked(){return Boolean.parseBoolean(isLocked);}
    public void lockDiary(){isLocked = String.valueOf(true);}
    public void unlockDiary(){isLocked = String.valueOf(false);}
    public Entry findEntryById(int id){
        for(Entry entry : diary){
            if (entry.getId()== id)  return entry;

        }
       return null;
    }
    public void createEntry(String title, String body){
        int holdId = generateId();
        Entry entry = new Entry(holdId, title, body);
        diary.add(entry);
        if (title == null || title.isEmpty() || body == null || body.isEmpty()) {
            throw new IllegalArgumentException("Title and body cannot be null or empty.");
        }


    }
    private int generateId(){
        return diary.size() + 1;
    }
    public void deleteEntry(int id){
        Entry entry = findEntryById(id);
        diary.remove(entry);
    }


    public void updateEntry(int id, String title, String body){
        Entry entry = findEntryById(id);
        entry.setId(id);
        entry.setTitle(title);
        entry.setBody(body);
        if (entry.getTitle().isEmpty()){
            entry.setTitle(title);}
        if (entry.getBody().isEmpty()){
            entry.setBody(body);
        }
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Object getUserName() {
        return userName;
    }
}

