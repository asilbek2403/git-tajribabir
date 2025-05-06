package asilcore.uz.Automat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Konfig {


    private String surname;
    private int age;



    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Konfig{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
