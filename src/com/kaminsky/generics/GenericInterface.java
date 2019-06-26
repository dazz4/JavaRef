package com.kaminsky.generics;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

// If a class implements a generic interface, then that class must also be generic!

// If you would do class GenericInterface implements MinMax<Integer> than it is okay to do so because we know
// the type parameter and class doesn't have to be generic

// interface interface-name<type-param-list> {
// class class-name<type-param-list> implements interface-name<type-arg-list>

class GenericInterface<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    GenericInterface(T[] o) {
        vals = o;
    }

    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }

    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {

        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        GenericInterface<Integer> iob = new GenericInterface<>(inums);
        GenericInterface<Character> cob = new GenericInterface<>(chs);
        System.out.println("Max number in inums: " + iob.max());
        System.out.println("Min number in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());

    }
}
