package com.kaminsky.enumerations;

enum Apple {

    RedDel(10),
    GoldenDel(2),
    Winesap(4);

    private int price;

    Apple(int i) {
        price = i;
    }

    int getPrice() {
        return price;
    }
}

class enumDemo {

    public static void main(String[] args) {

        Apple ap;
        ap = Apple.Winesap;

        // 2 predefinied methods
        Apple appleArray[] = Apple.values();
        Apple appleContant = Apple.valueOf("GoldenDel");

        System.out.println("Value of ap : " + ap);

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("Value of ap : " + ap);
        }

        switch (ap) {
            case GoldenDel:
                System.out.println("You have chosen GoldenDel.");
                break;
            case Winesap:
                System.out.println("You have chosen Winesap.");
                break;
            case RedDel:
                System.out.println("You have chosen RedDel.");
                break;
        }

        System.out.println();
        for (Apple array : appleArray) {
            System.out.println(array);
        }

        //OR
        System.out.println();
        for (Apple array2 : Apple.values()) {
            System.out.println(array2);
        }

        System.out.println();
        System.out.println("Price for the " + Apple.Winesap + " is " + Apple.Winesap.getPrice());

        System.out.println();
        for (Apple ap2 : Apple.values()) {
            System.out.println(ap2.ordinal() + ". " + ap2 + " : " + ap2.getPrice());
            System.out.println();
        }




    }

}
