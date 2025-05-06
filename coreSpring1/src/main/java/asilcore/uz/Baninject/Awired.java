package asilcore.uz.Baninject;


public class Awired {

    public String name;
    public String content;

//    public Awired(String name, String content) {
//    this.name = name;
//    this.content = content;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Awired{" +
                "name=" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
