package asilcore.uz.Automat;


import org.springframework.stereotype.Component;

@Component
public class Examo {

    private String name;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Examo{" +
                "name='" + name + '\'' +"surname"+surname+
                '}';
    }
}
