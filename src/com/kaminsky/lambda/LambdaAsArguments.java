package com.kaminsky.lambda;

interface Hello {
    String sayHello(String name);
}

public class LambdaAsArguments {

    // The method has a functional interface as the type of its first parameter.
    // Thus, it can be passed a reference to any instance of that interface,
    // including the instance created by a lambda expression.
    static String helloName(Hello h, String name) {
        return h.sayHello(name);
    }

    public static void main(String[] args) {
        String result;
        // Here we are passing a lambda expression as an argument
        result = helloName((str) -> "Hello " + str.toUpperCase(), "Darek");
        System.out.println(result);
    }

}
