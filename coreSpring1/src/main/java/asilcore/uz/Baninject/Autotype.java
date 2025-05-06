package asilcore.uz.Baninject;


public class Autotype {
//    private String name;
    private Awired awired;

    public Autotype(Awired awired) {
//        this.name = name;
        this.awired = awired;
    }
//
//    public void setName(String name) {
//        this.name = name;}

//    public void setAwired(Awired awired) {
//        this.awired = awired;
//    }

//    public String getName() {
//        return name;}

//    public Awired getAwired() {
//        return awired;
//    }


    @Override
    public String toString() {
        return "Autotype{" + '\'' +
                ", awired=" + awired +
                '}';
    }
}
