package com.kaminsky.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

// declaring annotation ---------------------------
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}


public class AnnoDemo {

    // Reflection example with a method without parameters
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        AnnoDemo ob = new AnnoDemo();

        try {
            Class<?> c = ob.getClass();
            System.out.println(ob.getClass());
            Method m = c.getMethod("myMeth");

            // MyAnno.class is called a class literal, you can use it whenever a Class object is needed
            // You could for example use Meta.class
            // You must know the name of the class
            // You can obtain a class literal for classes, interfaces, prmitive types and arrays

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }

    }


    // Reflection example with a method that has parameters
    @MyAnno(str = "Annotation Example2", val = 101)
    public static void myMeth2(String str, int i) {
        AnnoDemo ob = new AnnoDemo();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth2", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println(e.getCause());
        }
    }

    public static void main(String[] args) {
        myMeth();
        myMeth2("test", 2);
    }

}


