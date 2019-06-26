package com.kaminsky.enumerations;

enum Apples {

    Jonathan, GalaApple, Macintosh;

}

public class compareTo {

    public static void main(String[] args) {

        Apples ap1 = Apples.Jonathan;
        Apples ap2 = Apples.GalaApple;
        Apples ap3 = Apples.Macintosh;
        Apples ap4 = Apples.Macintosh;

        for (Apples a : Apples.values()) {
            System.out.println(a.ordinal() + ". " + a);
        }


        // Using equals(); method ----------------------------------------------
        if (ap1.compareTo(ap2) == 0) {
            System.out.println(ap1 + " equals" + ap2);
        }

        System.out.println();
        if (ap1.compareTo(ap2) < 0) {
            System.out.println(ap1 + " is greater than " + ap2);
        }

        System.out.println();
        if (ap3.compareTo(ap2) > 0) {
            System.out.println(ap3 + " is greater than " + ap2);
        }
        // ---------------------------------------------------------------------


        // Using equals(); method ----------------------------------------------
        System.out.println();
        if (ap3.equals(ap4)) {
            System.out.println(ap3 + " = " + ap4);
        }
        // ---------------------------------------------------------------------

        System.out.println();
        if (ap3 == ap4) {
            System.out.println(ap3 + " == " + ap4);
        }
    }
}
