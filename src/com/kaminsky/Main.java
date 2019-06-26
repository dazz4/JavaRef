package com.kaminsky;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
}

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Darek", 29));
        users.add(new User("Kasia", 36));
        users.add(new User("Dawid", 40));


        // Write a list of user into a file
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user.dat"))) {

            Iterator<User> itr = users.iterator();

            while (itr.hasNext()) os.writeObject(itr.next());

        } catch (IOException e) {
            e.getStackTrace();
        }

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("user.dat"))) {

                ArrayList<User> users1 =  (ArrayList<User>) is.readObject();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
