package io.tutorialspoint._01_basic_syntax;

public class FreshJuiceTest {

    public static void main(String[] args) {
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(freshJuice.size);
        freshJuice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(freshJuice.size);
        freshJuice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(freshJuice.size);
    }

}
