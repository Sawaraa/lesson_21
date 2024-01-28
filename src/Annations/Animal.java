package Annations;

import java.io.*;
import java.lang.reflect.Field;

public class Animal {

    @Importantly("Важливе значення")
    String type;
    String name;
    @Importantly("Важливе значення")
    int age;

    public Animal() {
    }

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }


}
