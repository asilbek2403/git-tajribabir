package asilcore.uz.Baninject;


import java.util.List;

public class Limona {


//    private String name;
//    private Integer age;
//    public void setName(String name){
//        this.name=name;}
//    public void setAge(Integer age){
//        this.age=age;}

    //Collection qismi level is Collection Map

    private String name;
    private int age;
    private List<String> item;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setItem(List<String> item) {
        this.item = item;
    }

    public void initMethod(){
        System.out.println("initMethod IOc ishga tushganda ishladi");
    }

    public void destroyMethod(){
        System.out.println("IOC IShga tushib bean o'chirilayotganda  ishladi");
    }




//    @Override
//    public String toString() {
//        return "Limona{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';}


    @Override
    public String toString() {
        return "Limona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", \nitem=\n" + item +
                '}';
    }


}
