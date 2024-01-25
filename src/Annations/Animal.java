package Annations;

import java.io.*;
import java.lang.reflect.Field;

public class Animal {

    @Importantly("Важливе значення")
    String type;
    String name;
    @Importantly("Важливе значення")
    int age;

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void saveInFile(File file) throws Exception{

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file));) {
            for (Field field : getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Importantly.class)) {
                    writer.write(field.getName() + "\n");
                }
            }
        } catch (IOException e) {
        }

    }

    public void output(File file)throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
