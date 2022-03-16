package Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFind {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");//(123)-456-7890
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
            Pattern pattern = Pattern.compile("\\(?+([0-9]{3})+\\)?+\\s?+-?+([0-9]{3})+(-[0-9]+)",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(number);

            if (matcher.matches() && !number.isBlank()) System.out.println(number);

        }
    }
}
//[987-123-4567]
//        []
//        [(123) 456-7890]
