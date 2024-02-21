import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Application to manipulate and print the result
 * @author lsethuraj
 * @since version 1.0
 */
public class CollectionLambdaStreamApiDemo {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("india","africa","china","australlia","age");
        List<String> filteredStrings = filterStrings(stringList);
        System.out.println("Filtered strings: " + filteredStrings); //Print the filtered strings
        
        List<Integer> integerList = Arrays.asList(3, 44);
		String formattedString = formatNumbers(integerList);
        System.out.println("Formatted string: '" + formattedString + "'");
        
        List<Integer> numbers1 = Arrays.asList(10, 30, 15, 20, 50, 5);  //For sample input 1
        printLargestNumbers(numbers1);       
        List<Integer> numbers2 = Arrays.asList(1, 2, 3);  //For sample input 2
        printLargestNumbers(numbers2);
        List<Integer> numbers3 = Arrays.asList(20, 30);  //For sample input 3
        printLargestNumbers(numbers3);
        
    }
    public static List<String> filterStrings(List<String> inputList) {//method to find the 3 letter string starting by a
        return inputList.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
	}
    public static String formatNumbers(List<Integer> numbers) {//method that returns a comma-separated string preceded with e,o
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(","));
    }
    public static void printLargestNumbers(List<Integer> numbers) {
        List<Integer> largestThree = numbers.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(largestThree.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

}
