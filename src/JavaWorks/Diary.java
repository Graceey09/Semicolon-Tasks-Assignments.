package JavaWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary{
    private String userName;
    private String password;
    private String isLocked;
    private List<Entry> diary = new ArrayList<>();
    private Entry entry;
    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public boolean isLocked(){return Boolean.parseBoolean(isLocked);}
    public void lockDiary(){isLocked = String.valueOf(true);}
    public void unlockDiary(){isLocked = String.valueOf(false);}
    public Entry findEntryById(String id){
        for(Entry entry : diary){
            if (entry.getId().equals(id)){
                return entry;
            }
        }
        return null;
    }
    public void createEntry(String title, String body){
        Entry entry = new Entry(generateId(), title, body);
        diary.add(entry);
    }
    private String generateId(){
        return diary.size() + 1 + " ";
    }
    public void deleteEntry(String id){
        for (Entry entry : diary){
            if (!Objects.equals(entry.getId(), id)){
                diary.remove(entry);
            }
        }
    }
    public void updateEntry(String id, String title, String body){
        Entry entry = findEntryById(id);
        entry.setId(id);
        entry.setTitle(title);
        entry.setBody(body);
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

