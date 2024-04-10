import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of the array separated by spaces: ");
        String input = scanner.nextLine();

        String[] elements = input.split(" ");
        int index = findIndexAfterNegativeOne(elements);

        System.out.println("Index x where all elements after it are -1: " + index);
    }

    public static int findIndexAfterNegativeOne(String[] arr) {
        int index = 0;
        while (index < arr.length&& !arr[index].equals("-1") ) {
            index++;
        }
        return index-1 ;
    }
}