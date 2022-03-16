package Task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> persons = readFile("Humans.txt");

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> people) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonPeople = gson.toJson(people);
        JSONFileWrite.write("Users.json", jsonPeople);
    }


    public static ArrayList<Person> readFile(String filename) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        File file = new File(filename);
        Scanner scanFile = new Scanner(file);
        scanFile.nextLine();
        while (scanFile.hasNext()) {
            String name = scanFile.nextLine();// ryan 30
            String[] nameAndAge = name.split(" ");
            people.add(new Person(nameAndAge[0], Integer.parseInt(nameAndAge[1])));
        }

        return people;
    }
}
