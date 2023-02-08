package homework17;

public class Node{
    Node rightNode, leftNode;
    int data;

    public Node() {
        rightNode = null;
        leftNode = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
