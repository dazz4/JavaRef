//package com.kaminsky.generics;
//
//public class GenericRestrictions<T, V> {
//    T ob;
//
//    GenericRestrictions(T o) {
//        ob = new T(); // it won't compile, you can't create an instance of a type parameter
//    }
//
//    // RESTRICTIONS ON STATIC MEMBERS
//    static V obv; // no static variables of type T
//    static T getob() { } // no static method can use T
//
//    // RESTRICTIONS ON ARRAYS
//    vals = new T[10] // can't create an array of T
//
//    //Can't create an array of type-specific generic references.
//    Gen<Integer> gens[] = new Gen<Integer>[10]; // wrong!
//    Gen<?> gens[] = new Gen<>[10]; // OK
//}
