package be.intecbrussel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class CivilService {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2000, 04, 12);
        //  LocalDate localDate = LocalDate.now();

        Person johnson = new Person("Arthur", "Johnson", localDate);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(

                new FileInputStream("C:\\Users\\Gebruiker\\NewData\\PersonFile.txt"))) {

            Person someone = (Person)objectInputStream.readObject();

            System.out.println(johnson);

        }   catch(FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();

        }

    }
}
