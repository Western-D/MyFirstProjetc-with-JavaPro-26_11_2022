package hometask13.phonebook;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.addSubscriber("Artur", "+380664256930");
        phonebook.addSubscriber("Dmytro", "+380664756930");
        phonebook.addSubscriber("Sergiy", "+380664256930");
        phonebook.addSubscriber("Vova", "+380664256530");
        phonebook.addSubscriber("Anton", "+380664256290");
        phonebook.addSubscriber("Artur", "+380674256930");
        phonebook.addSubscriber("Anton", "+380666256930");
        System.out.println(phonebook.find("Anton"));
        System.out.println(phonebook.findAll("Artur"));
        System.out.println(phonebook.find("Kir"));
        System.out.println(phonebook.findAll("Andrey"));
    }
}
