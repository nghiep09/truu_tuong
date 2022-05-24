package QL_Khach_Tro;

public class Nguoi {
    private String name;
    private int age;
    private int CCCD;

    public Nguoi() {

    }

    public Nguoi(String name, int age, int CCCD) {
        this.name = name;
        this.age = age;
        this.CCCD = CCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CCCD=" + CCCD +
                '}';
    }
}
