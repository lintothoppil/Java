    import java.util.Arrays;
    import java.util.Scanner;

    public class StringSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            scanner.nextLine();
            String[] strings = new String[size];
            System.out.println("Enter the items:");
            for (int i = 0; i < size; i++) {
                System.out.print("Item " + (i + 1) + ": ");
                strings[i] = scanner.nextLine();
            }
            System.out.println("Original array: " + Arrays.toString(strings));
            Arrays.sort(strings);
            System.out.println("Sorted array: " + Arrays.toString(strings));
            scanner.close();
        }
    }
