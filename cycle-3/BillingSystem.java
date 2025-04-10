import java.util.Scanner;

// Interface with calculate method
interface Billable {
    void calculate();
}

// Item class implementing Billable
class Item implements Billable {
    String itemName;
    int quantity;
    double price, total;

    void read(Scanner sc) {
        System.out.print("Enter item name: ");
        itemName = sc.nextLine();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter price per item: ");
        price = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    public void calculate() {
        total = quantity * price;
    }

    void display() {
        System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemName, quantity, price, total);
    }

    double getTotal() {
        return total;
    }
}

// Main class
public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Item " + (i + 1) + ":");
            items[i] = new Item();
            items[i].read(sc);
            items[i].calculate();
        }

        // Display bill
        System.out.println("\n---------------- BILL ----------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Quantity", "Price", "Total");

        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            items[i].display();
            grandTotal += items[i].getTotal();
        }

        System.out.println("-------------------------------------");
        System.out.printf("Grand Total: %.2f\n", grandTotal);

        sc.close();
    }
}

