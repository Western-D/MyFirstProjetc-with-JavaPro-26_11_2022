package hometask15;

public class Order {
    private int numberOfOrder;
    private String nameOfPerson;

    public Order(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public Order(int numberOfOrder, String nameOfOrder) {
        this.numberOfOrder = numberOfOrder;
        this.nameOfPerson = nameOfOrder;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

}
