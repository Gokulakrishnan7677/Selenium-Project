import java.util.Scanner;
/**
 * Application to manipulate and print the string
 * @author lsethuraj
 * @since version 1.0
 */
public class StringManipulation {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); //Initializing the string from user using Scanner
        System.out.println("Enter a string:");
        String input = read.nextLine();
        
        String s = swap(input); //Initializing the swapping of the string        
        System.out.println("Swapped string: " + s); //Print the swapped string
    }
    public static String swap(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;        
        for (int i = 0; i < length - 1; i += 2) { //swapping the pair of characters in the string
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }        
        return new String(charArray);
	}
}
