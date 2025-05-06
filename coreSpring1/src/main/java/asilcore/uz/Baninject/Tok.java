package asilcore.uz.Baninject;

public class Tok {

    private String name;

    public Tok(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nTok{" +
                "name='" + name + '\'' +
                '}';
    }
}
