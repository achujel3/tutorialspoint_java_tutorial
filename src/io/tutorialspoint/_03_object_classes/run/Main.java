package io.tutorialspoint._03_object_classes.run;

import io.tutorialspoint._03_object_classes.Puppy;

public class Main {

    public static void main(String[] args) {

        Puppy puppy = new Puppy(1, "Doggo");
        Puppy puppy2 = new Puppy(3, "Doggie");

        System.out.println(puppy);
        System.out.println(puppy2);

    }

}
