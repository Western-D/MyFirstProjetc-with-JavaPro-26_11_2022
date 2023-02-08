package homework17;

public class SimpleTree{
    Node rootNode;
    private int size = 0;
    public SimpleTree() {
        this.rootNode = new Node();
    }

    public void add(int data){
        add(rootNode, data);
    }

    public int getSize() {
        return size;
    }

    public void add(Node node, int data){
        if(node.data == 0) {
            node.data = data;
            ++size;
        }
        else if(node.data < data)
        {
            if (node.rightNode == null)
                node.rightNode = new Node();
            add(node.rightNode, data);
        }
        else if(node.data > data)
        {
            if (node.leftNode == null)
                node.leftNode = new Node();
            add(node.leftNode, data);
        }
    }
    public boolean findNumber(int number){
        return findNumber(rootNode, number);
    }
    private boolean findNumber(Node node, int number){
        if(node.data == number){
            return true;
        }
        else if(node.data > number && node.leftNode != null){
            return findNumber(node.leftNode, number);
        }
        else if(node.data < number && node.rightNode != null){
            return findNumber(node.rightNode, number);
        }
        return false;
    }
    public MyIterator getIterator(){
        return new MyIterator(this);
    }
}
