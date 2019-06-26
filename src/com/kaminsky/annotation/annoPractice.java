package com.kaminsky.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno1 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Anno2 {
    String str();

    int val();
}

public class annoPractice {

    @Anno1(str = "Anno", val = 1)
    public static void myMeth() {
        System.out.print("myMeth2 with 0 parameters");
        annoPractice ap = new annoPractice();

        try {
            Class<?> c = ap.getClass();
            Method m = c.getMethod("myMeth");
            Anno1 a = m.getAnnotation(Anno1.class); // class literal

            System.out.println(" - " + a.str() + " " + a.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method doesn't exist" + e.getMessage());
        }
    }

    @Anno2(str = "Anno", val = 2)
    public static void myMeth2(String str, int val) {
        System.out.print("myMeth2 with 2 parameters");

        annoPractice ap = new annoPractice();

        try {
            Class<?> c = ap.getClass();
            Method m = c.getMethod("myMeth2", String.class, int.class);
            Anno2 a = m.getAnnotation(Anno2.class); // class literal

            System.out.println(" - " + a.str() + " " + a.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method doesn't exist" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        myMeth();
        myMeth2("test", 2);

    }
}
