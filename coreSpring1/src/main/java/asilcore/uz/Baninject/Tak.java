package asilcore.uz.Baninject;


import java.util.List;

public class Tak {
    private String name;
    private List<Tok> item;

    public Tak(String name, List<Tok> item) {
        this.name = name;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Tak{" +
                "name='" + name + '\'' +
                ",\n item=" + item +
                '}';
    }
}
