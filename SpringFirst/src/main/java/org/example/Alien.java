package org.example;

public class Alien {
    private String name;
    private int age;
    private Computer com;

    public Alien(String name, int age, Computer com){
        this.name = name;
        this.age = age;
        this.com = com;
    };

    public Alien(){
        System.out.println("This is constructor in Alien!");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
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

    public void code(){
        System.out.println("coding...");
        com.code();
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", com=" + com +
                '}';
    }
}
