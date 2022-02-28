package Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneNumberFind {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\file.txt");//(123)-456-7890
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
//            List<String> numbers = Collections.singletonList(scanner.nextLine());
//            List<String> phoneNumbers = numbers.stream()
//                    .filter((number) -> number.contains("-"))
//                    .collect(Collectors.toList());
//
//            phoneNumbers.removeIf(String::isBlank);
//
//            System.out.println(phoneNumbers);
            String number = scanner.nextLine();
            if (number.contains("-") && !number.isBlank()) System.out.println(number);

        }
    }
}
//[987-123-4567]
//        []
//        [(123) 456-7890]
