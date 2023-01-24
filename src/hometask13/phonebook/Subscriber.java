package hometask13.phonebook;

public class Subscriber {
    private String name;
    private String phoneNumber;

    public Subscriber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
