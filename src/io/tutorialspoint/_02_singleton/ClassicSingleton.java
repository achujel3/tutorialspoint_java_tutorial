package io.tutorialspoint._02_singleton;

public class ClassicSingleton {

    private static ClassicSingleton classicSingleton = null;

    private ClassicSingleton() { }

    public static ClassicSingleton getInstance() {
        if (classicSingleton == null) {
            classicSingleton = new ClassicSingleton();
        }
        return classicSingleton;
    }

    public void demoMethod() {
        System.out.println("This is some demo method for ClassicSingleton");
    }
}
