package io.tutorialspoint._02_singleton.run;

import io.tutorialspoint._02_singleton.ClassicSingleton;
import io.tutorialspoint._02_singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.demoMethod();
        System.out.println(singleton.hashCode());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.demoMethod();
        System.out.println(singleton2.hashCode());

        if (singleton.hashCode() == singleton2.hashCode()) {
            System.out.println("Same shit");
        }

        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        classicSingleton.demoMethod();
        System.out.println(classicSingleton.hashCode());

        ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();
        classicSingleton2.demoMethod();
        System.out.println(classicSingleton2.hashCode());

        if (classicSingleton.hashCode() == classicSingleton2.hashCode()) {
            System.out.println("Same shit");
        }
    }

}
