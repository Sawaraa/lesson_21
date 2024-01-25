package Annations;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Annations.Animal.txt");

        Animal animal = new Animal("Кіт", "Елла",6);
        animal.saveInFile(file);
        animal.output(file);
        
    }
}