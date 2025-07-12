package Utils;
import java.util.Arrays;
import java.util.List;
import static Utils.MostCommonName.mostCommonName;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Maria", "Ivan", "Georgi", "Ivan", "Maria");
        System.out.println("Most common name is: " + mostCommonName(names));
    }
}
