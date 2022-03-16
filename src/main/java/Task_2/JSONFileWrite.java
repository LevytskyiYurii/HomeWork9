package Task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONFileWrite {
        public static void write(String path, String personsJson) {

            File file = new File(path);
            FileWriter writer;

            try {
                writer = new FileWriter(file);
                writer.write(personsJson);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
