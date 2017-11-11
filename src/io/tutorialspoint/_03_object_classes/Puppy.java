package io.tutorialspoint._03_object_classes;

public class Puppy {

    private int age;
    private String name;

    public Puppy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
