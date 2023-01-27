package hometask15;

public class Order {
    private int numberOfOrder;
    private String nameOfOrder;

    public Order(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public String getNameOfOrder() {
        return nameOfOrder;
    }

    public Order(int numberOfOrder, String nameOfOrder) {
        this.numberOfOrder = numberOfOrder;
        this.nameOfOrder = nameOfOrder;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

}
