package hw4;

public class Buyer {
    private String FIO;
    private int age;
    private String telephone;

    public Buyer(String FIO, int age, String telephone) {
        this.FIO = FIO;
        this.age = age;
        this.telephone = telephone;
    }

    public String getFIO() {
        return FIO;
    }

    @Override
    public String toString() {
        return "Buyer's name " + FIO + '\'' +
                ", age=" + age +
                ", telephone='" + telephone;
    }
}
