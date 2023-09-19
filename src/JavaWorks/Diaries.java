package JavaWorks;
import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private String userName;
    private String password;
    private List<Diary> diaries = new ArrayList<>();

    public void addDairy(String userName, String password){
        Diary dairy = new Diary(userName, password);
        diaries.add(dairy);
    }
    public void deleteDiary(String userName) throws IllegalArgumentException {
        Diary user = findByUserName(userName);
        diaries.remove(user);
    }

    public Diary findByUserName(String userName) {
        for(Diary diary: diaries){
            if(diary.getUserName().equals(userName)){
                return diary;
            }
        }
        throw new IllegalArgumentException("Enter a valid account");
    }

    public void validatePassword(String userName, String password){
        if (!findByUserName(userName).getPassword().equals(password))
            throw new IllegalArgumentException("Incorrect Password");
    }
}
