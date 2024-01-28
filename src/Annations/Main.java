package Annations;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Annations.Animal.txt");

        FileSave fileSave = new FileSave();
        fileSave.saveInFile(file);
        fileSave.output(file);
        
    }
}