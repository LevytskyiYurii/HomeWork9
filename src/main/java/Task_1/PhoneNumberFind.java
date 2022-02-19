package Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneNumberFind {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\file.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            List<String> numbers = Collections.singletonList(scanner.nextLine());
            Stream<String> numbersStream = numbers.stream()
                            .filter((number) -> number.contains("-"));
            List<String> phoneNumbers = numbersStream.collect(Collectors.toList());

            System.out.println(phoneNumbers);
        }
    }
}
