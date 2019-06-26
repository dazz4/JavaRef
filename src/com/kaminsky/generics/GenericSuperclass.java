package com.kaminsky.generics;

class NonGeneric {
    // Non generic superclass can be inherited by generic subclass
}

public class GenericSuperclass<T> extends NonGeneric {

    T ob;

    GenericSuperclass(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

}

// A sublass of GenericSupperclass
// It can have it's own generic types for example :
// class GenericSubclass<T, V> extends GenericSuperclass<T>

class GenericSubclass<T> extends GenericSuperclass<T> {

    // In generic hierarchies any type arguments needed by a generic superclass
    // must be passed up the hierarchy by all subclasses

    GenericSubclass(T o) {
        super(o);
    }

}
