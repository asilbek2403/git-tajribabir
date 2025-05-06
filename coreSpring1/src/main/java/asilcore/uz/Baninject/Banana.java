package asilcore.uz.Baninject;


import java.util.List;
import java.util.Map;

public class Banana {
    private String name;
    private int age;
    private List<String> headers;
    private Map<String,String> footers;

    public Banana(String name, int age, List<String> headers, Map<String, String> footers) {
        this.name = name;
        this.age = age;
        this.headers = headers;
        this.footers = footers;
    }

    //    public Banana(String name, int age, List<String> headers) {
//        this.name = name;
//        this.age = age;
//        this.headers = headers;
//    }

//    public Banana(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    //    public Banana(String name) {
//        this.name = name;}

    public void initMethod(){
        System.out.println("initMethod IOc ishga tushganda ishladi");
    }

    public void destroyMethod(){
        System.out.println("IOC IShga tushib bean o'chirilayotganda  ishladi");
    }


//    @Override
//    public String toString() {
//        return "Banana{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';}
//    @Override
//    public String toString() {
//        return "Banana{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", headers=" + headers +
//                '}';}


    @Override
    public String toString() {
        return "Banana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", headers=" + headers +
                ", footers=" + footers +
                '}';
    }
}
