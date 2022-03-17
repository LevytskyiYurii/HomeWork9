package Task_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

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

        Map<Integer, String> wordsCount = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            wordsCount.put(count.get(i), words.get(i));
        }
            Map<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
                sorted.putAll(wordsCount);

            for (Map.Entry<Integer, String> entry : sorted.entrySet()){
                System.out.println("Word :" + entry.getValue() + ", frequency :" + entry.getKey());

        }
        }
}
