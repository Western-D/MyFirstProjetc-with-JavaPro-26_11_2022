public class Animal {


    String name;
    byte paws;
    int age;
    boolean sex;
    public Animal(String name, byte paws, int age, boolean sex) {
        this.name = name;
        this.paws = paws;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
