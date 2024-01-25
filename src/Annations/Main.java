import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Animal.txt");

        Animal animal = new Animal("Кіт", "Елла",6);
        animal.saveInFile(file);
        animal.output(file);
        
    }
}