package Task_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("words.txt");
        Scanner file = new Scanner(fin);

        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        while (file.hasNext()){
            String nextWord = file.next();
            if (words.contains(nextWord)){
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index)+1);
            }else {
                words.add(nextWord);
                count.add(1);
            }
        }
        file.close();
        fin.close();

        for (int i = 0; i < words.size(); i++) {

            System.out.println(words.get(i) + " " + count.get(i));
        }
    }
}
