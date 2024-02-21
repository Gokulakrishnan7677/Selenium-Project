import java.util.Scanner;
/**
 * Application to print the Bucket Id's based on number of image files and those file sizes
 * @author lsethuraj
 * @since version 1.0
 */
public class BucketID {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //Initialize the Scanner   
        System.out.println("Enter the number of image files (N):");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid File numbers");//Checks the number of files and print the result
            return;
        }
        int[] fileSizes = new int[N];
        System.out.println("Enter the file sizes:");
        
        for (int i = 0; i < N; i++) {
            fileSizes[i] = scanner.nextInt();
            if (fileSizes[i] < 0) {  //Checks whether the file size is greater than zero, if not then invalid message is printed
                System.out.println("Invalid ImagefileSize");
                return;
            }
        }
        System.out.println("Bucket IDs:");
        for (int i = 0; i < N; i++) {
            int bucketId = computeBucketId(fileSizes[i]);
            System.out.print(bucketId + " ");
        }
    }
    public static int computeBucketId(int fileSize) {
        int sumOfDigits = 0;
        while (fileSize > 0) {
            sumOfDigits += fileSize % 10;
            fileSize /= 10;
        }
        return sumOfDigits;
    }
}
