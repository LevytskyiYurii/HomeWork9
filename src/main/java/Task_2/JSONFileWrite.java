package Task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONFileWrite {
    public static void main(String[] args) {

    }
    File file = new File("./Users.json");
    FileWriter writer;

    private String printPersons;

    {
        try {
            writer = new FileWriter(file);
            writer.write(printPersons);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public JSONFileWrite(String printPersons) {
        this.printPersons = printPersons;
    }
}
