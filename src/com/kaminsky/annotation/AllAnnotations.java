package com.kaminsky.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

@interface newAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String descrption();
}

@What(descrption = "An annotation test class")
@newAnno(str = "AllAnnotations", val = 99)
class AllAnnotations {

    @What(descrption = "An annotation test method")
    @newAnno(str = "Testing", val = 100)
    public static void myMeth() {

        AllAnnotations ob = new AllAnnotations();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All annotations for AllAnnotations class.");
            for (Annotation a : annos) {
                System.out.println(a);
            }

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            for (Annotation b : annos) {
                System.out.println(b);
            }

        } catch (NoSuchMethodException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
