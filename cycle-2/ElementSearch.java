import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                System.out.println(target + " found.");
                scanner.close();
                return;
            }
        }

        System.out.println(target + " not found.");
        scanner.close();
    }
}

