package JavaWorks;

public class Entry {
    String id;
    String title;
    String body;
    public Entry(String id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public void setId(String id){this.id = id;}
    public String getId(){return id;}
    public void setTitle(String title){this.title = title;}
    public String getTitle(){return title;}
    public void setBody(String body){this.body = body;}
    public String getBody(){return body;}
    public String getEntry(){return id + " " + title + " " + body;}
}
