package be.intecbrussel;

import java.time.LocalDate;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Timer;
import java.util.TimerTask;

public class MaternityApp {
    public static void main(String[] args) throws IOException {

        LocalDate localDate = LocalDate.of(2000, 04, 12);
        //  LocalDate localDate = LocalDate.now();

        Person johnson = new Person("Arthur", "Johnson", localDate);
        


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Gebruiker\\NewData\\PersonFile.txt"))) {
            objectOutputStream.writeObject(johnson);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException E) {
            E.printStackTrace();
        }
    }
}
