package asilcore.uz.Baninject;


import java.util.List;

public class Objfruit {
    public String name;
    public List<Fruit> item;

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(List<Fruit> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Objfruit{" +
                "name='" + name + '\'' +
                ", item=" + item +
                '}';
    }
}
