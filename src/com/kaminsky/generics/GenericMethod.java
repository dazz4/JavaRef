package com.kaminsky.generics;

class GenMethDemo {

    // The type parameters are declared before the return type of the method
    // <type-param-list> ret-type meth-name(param-list) { ...
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};

        if (isIn(2, nums)) System.out.println("2 is in nums");

        // You can specify the type argument by calling
        // GenMethDemo.<Integer, Integer>isIn(2, nums);

        if(!isIn(7, nums)) System.out.println("7 is not in nums");

        System.out.println();

        String strs[] = {"one", "two", "three", "four", "five"};

        if (isIn("two", strs)) {
            System.out.println("two is in strs");
        }

        if (isIn("seven", strs)) {
            System.out.println("seven is not in strs");
        }

//        if (isIn("two", nums)) {
//            System.out.println("Won't compile, nums is not a String");
//        }

    }

}

class GenericMethod {


}
