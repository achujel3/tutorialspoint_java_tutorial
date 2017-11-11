package io.tutorialspoint._02_singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }

    public void demoMethod() {
        System.out.println("Some demo method");
    }
}
