package com.kaminsky.generics;

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();

        }
        return sum / nums.length;
    }

    // A generic type is a type with formal type parameters
    // A parameterized type is an instantiation of a generic type with actual type arguments.
    // Wildcard Stats<?>, if it would be Stats<Double> for example, you would not be able to pass Integer
    // via this method
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

public class Wcard {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is: " + v);

        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is: " + w);


        if (iob.sameAvg(dob)) {
            System.out.println("Averages of iob and dob are the same.");
        } else
            System.out.println("Averages of iob and dob are not the same.");
    }
}
