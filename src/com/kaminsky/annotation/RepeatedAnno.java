package com.kaminsky.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnnoNew {
    String str() default "Testing";
    int val() default 9000;
}

// You have to create a container for repeated annotations
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnnoNew[] value();
}
public class RepeatedAnno {

    @MyAnnoNew(str = "First annotation", val = -1)
    @MyAnnoNew(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatedAnno ob = new RepeatedAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        myMeth("test", 1);
    }

}
