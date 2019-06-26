package com.kaminsky.ioCharStreams;

import java.io.*;

class User implements Serializable {
    String name;
    int age;
    double weight;

    User(String n, int a, double w) {
        name = n;
        age = a;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objStr = new ObjectOutputStream(new FileOutputStream("userdata"))) {

            // serialization
            objStr.writeObject(new User("Darek", 29, 60.7));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream objInp = new ObjectInputStream(new FileInputStream("userdata"))) {

            // deserialization
            User newUser = (User) objInp.readObject();
            System.out.println(newUser.name + " " + newUser.age + " " + newUser.weight);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
