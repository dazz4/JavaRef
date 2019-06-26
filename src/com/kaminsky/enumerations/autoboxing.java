package com.kaminsky.enumerations;

public class autoboxing {



    public static void main(String[] args) {

        // Manual boxing and unboxing
        Integer iobs = new Integer(100);
        int i = iobs.intValue();
        System.out.println(i);

        // Autoboxing and autounboxing
        Integer iObj2 = 100;
        int y = iObj2;

        System.out.println(y);


    }
}
