package com.kaminsky.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


// Marker annotation
// contains no members
//

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnno {}

public class Marker {

    @MarkerAnno
    public static void myMeth() {

        try {

            Marker ob = new Marker();
            Method m = ob.getClass().getMethod("myMeth");
            System.out.println(m.isAnnotationPresent(MarkerAnno.class));
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }



}
