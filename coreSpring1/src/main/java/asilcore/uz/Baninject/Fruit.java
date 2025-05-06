package asilcore.uz.Baninject;


import org.w3c.dom.Text;

public class Fruit {
    private String name;
    private String content;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + "content"+content+'\'' +
                '}';
    }

    public void setContent(String content) {
        this.content = content;
    }


}
