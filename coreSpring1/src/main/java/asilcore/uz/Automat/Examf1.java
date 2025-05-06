package asilcore.uz.Automat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Examf1 {


    private Examo examo;
    @Autowired
    public Examf1(Examo examo) {
        this.examo = examo;
    }
//    public Examo getExamo() {
//        return examo;
//    }
//
//    public void setExamo(Examo examo) {
//        this.examo = examo;
//    }


    @Override
    public String toString() {
        return "Examf1{" +
                "examo=" + examo +
                '}';
    }
}
