package Homework_2;

public abstract class Animal implements Animal_action{
    private String name;
    private byte paws;
    private short age;
    private boolean sex;
    private boolean isSleep;
    public Animal(String name, byte paws, short age, boolean sex) {
        this.name = name;
        this.paws = paws;
        this.age = age;
        this.sex = sex;
    }

    public void IsSleep()
    {
        if (isSleep)
            System.out.println(this.name + " is sleeping!");
        else System.out.println(name + " isn`t sleeping!");
    }
    @Override
    public void doSleep() {
        isSleep = true;
        IsSleep();
    }
    @Override
    public void doDrink() {
        System.out.println(this.name + " is drinking!");
    }

    @Override
    public void doEat() {
        System.out.println(this.name + " is eating!");
    }

    public String getName() {
        return name;
    }

    public byte getPaws() {
        return paws;
    }

    public short getAge() {
        return age;
    }

    public boolean isSex() {

        return sex;
    }
    public String getSex()
    {
        if(sex) return "Male";
        return "Female";
    }

}
