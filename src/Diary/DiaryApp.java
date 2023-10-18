package Diary;
import javax.swing.*;
import java.util.InputMismatchException;


public class DiaryApp {
    private static String userName;
    private static String password;
    private static String titleEdited;
    private static String bodyEdited;
    private static String body;
    private static String title;

    private static final Diaries myDiary = new Diaries();

    public static void main(String[] args) {
        diaryMenu();
    }

    private static void diaryMenu() {
        String mainMenu = """
                +++++++++++++++++++++++++++++++++++
                Welcome to MyDiary
                1 ->Create Diary
                2 ->Login Diary
                3 ->Exit
                ++++++++++++++++++++++++++++++++++++
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createDiary();
            case '2' -> loginDiary();
            case '3' -> exit();
            default -> System.exit(1);
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void loginDiary() {
        String user = input("Enter user name");
        if (!user.equals(userName)) {
            JOptionPane.showMessageDialog(null, "User name not found");
            loginDiary();
        }
        String security = input("Enter your password");
        if (!security.equals(password)) {
            JOptionPane.showMessageDialog(null, "Your password did not match your user name, try again");
            loginDiary();
        }
        entryMenu();
    }

    private static void createDiary() {
        String userName = input("Enter your user name");
        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "user name can not be empty");
            createDiary();
        }
        String password = input("Enter password for unlocking your diary");
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password can not be empty");
            createDiary();
        }
        myDiary.addDairy(userName, password);
        String message = "Hello" + " " + userName + "Diary has been created successfully.";
        JOptionPane.showMessageDialog(null, message);
        entryMenu();
    }


    private static void entryMenu() {
        String mainMenu = """
                +++++++++++++++++++++++++++++++++++
                1 ->Create Entry
                2 ->Find Entry
                3 ->Delete Entry
                4 ->Update Entry
                5 ->Lock Diary
                6 ->Exit
                ++++++++++++++++++++++++++++++++++++
                """;
        String userInput = input(mainMenu);
        switch (userInput) {
            case "1" -> createEntry();
            case "2" -> findEntry();
            case  "3" -> deleteEntry();
            case "4" -> updateEntry();
            case  "5" -> lockEntry();
            case "6" -> exit();
            default -> logout();
        }
    }

    private static void logout() {
        System.exit(0);
    }

    private static void lockEntry() {
        String userPassword = input("Enter password to lock");
        if (!userPassword.equals(password)){
            throw new InputMismatchException("Incorrect password");
        }
        JOptionPane.showMessageDialog(null, "Diary is locked");
        String response = input("Enter Yes to back to diary / No ");
        if (response.equalsIgnoreCase("Yes")) {
            entryMenu();
        }
        else {
            System.exit(0);
        }
    }

    private static void updateEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");}
        updateEntry();
        if (!id.equals(0)){
            updateEntry();
            throw new NullPointerException("Entry not found");
        }
        myDiary.findByUserName(userName).findEntryById(Integer.parseInt(id)).getEntry();
        myDiary.findByUserName(userName).updateEntry(Integer.parseInt(id), title, body);

        String editTitle = String.valueOf(JOptionPane.showInputDialog("Enter yes to edit title"));
        if (editTitle.equalsIgnoreCase("Yes")){
            JOptionPane.showMessageDialog(null, title);
            titleEdited = JOptionPane.showInputDialog("Edit");
        }
        if (editTitle.equalsIgnoreCase("No")){
            entryMenu();
        }
        String editBody = input("Enter yes to edit body");
        if (editBody.equalsIgnoreCase("Yes")){
            JOptionPane.showMessageDialog(null, body);
            bodyEdited = JOptionPane.showInputDialog("Edit");
        }
        if (editBody.equalsIgnoreCase("No")){
            entryMenu();
        }
        JOptionPane.showMessageDialog(null, "Entry successfully updated");

        int confirmUpdate = Integer.parseInt(input("Enter entry id to see entry updated"));
        myDiary.findByUserName(userName).findEntryById(confirmUpdate).getEntry();
        JOptionPane.showMessageDialog(null, titleEdited);
        JOptionPane.showMessageDialog(null, bodyEdited);
        entryMenu();
    }

    private static void deleteEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");}
        deleteEntry();
        if (!id.equals(0)){
            deleteEntry();
            JOptionPane.showMessageDialog(null, "invalid id, try again");
            deleteEntry();
        }
        myDiary.findByUserName(id).deleteEntry(Integer.parseInt(id));
        String message = input("you are about to delete this entry, enter yes to continue");
        if(message.equalsIgnoreCase("Yes")){
            JOptionPane.showMessageDialog(null,title);
            JOptionPane.showMessageDialog(null, body);
            JOptionPane.showMessageDialog(null, "entry has been deleted successfully");
        }
        if (message.equalsIgnoreCase("No")){
            entryMenu();
        }
    }


    private static void findEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");}
        findEntry();
        if (id.equals(0)){
            findEntry();
            throw new InputMismatchException("Invalid id");
        }
        myDiary.findByUserName(userName).findEntryById(Integer.parseInt(id)).getEntry();
        JOptionPane.showMessageDialog(null, title);
        JOptionPane.showMessageDialog(null,"body");
        entryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title");
        if (title.isEmpty() ){
            JOptionPane.showConfirmDialog(null, "title must be entered, try again");
            createEntry();
        }
        String body = input("Enter body");
        if (body.isEmpty()){
            JOptionPane.showMessageDialog(null, "body must be entered, try again");
            createEntry();
        }
        myDiary.findByUserName(userName).createEntry(title, body);
        JOptionPane.showMessageDialog(null, "Entry successfully created with title as: " + "\"" + title + "\"" + "and body as: " + "\"" + body + "\"");
        entryMenu();
    }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
    }
}
