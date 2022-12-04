package Hometask2.p_2_and_3;

public class Employees {


    public Employees(String last_name, String first_name, String father_name, int age, String position, String e_mail, String phone_number) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.father_name = father_name;
        this.age = age;
        this.position = position;
        this.e_mail = e_mail;
        this.phone_number = phone_number;
    }
    final private String last_name;
    final private String first_name;
    final private String father_name;
    final private int age;
    private String position;
    private String e_mail;
    private String phone_number;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getFullName(){return last_name + " " + first_name + " " + father_name;}

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getPhone_number() {
        return phone_number;
    }



}
