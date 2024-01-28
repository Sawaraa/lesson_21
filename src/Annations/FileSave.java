package Annations;

import java.io.*;
import java.lang.reflect.Field;

public class FileSave {

    Animal animal = new Animal();

    public void saveInFile(File file){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(file)));) {
            for (Field field : animal.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Importantly.class)) {
                    writer.write(field.getName() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void output(File file)throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(file)));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
