package asilcore.uz.Automat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Benlary {


    private String name;
    @Autowired
    private Examo examo;
    @Autowired
    private Konfig konfig;


//    @Bean
//    public Examo examo() {
//        Examo examo = new Examo();
//        examo.setName(name);
//        return examo;
//
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setExamo(String examo) {
//        this.examo = examo;
//    }
//
//    public void setKonfig(Konfig konfig) {
//        this.konfig = konfig;
//    }



        @Bean
        public Examo examo() {
            Examo e = new Examo();
            e.setName("Ali");
            e.setSurname("Valiyev");
            return e;
        }

        @Bean
        public Konfig konfig() {
            Konfig k = new Konfig();
            k.setAge(30);
            k.setSurname("Rustamov");
            return k;
        }


    @Override
    public String toString() {
        return "Benlary{" +
                "name='" + name + '\'' +
                ", examo='" + examo + '\'' +
                ", konfig=" + konfig +
                '}';
    }
}
