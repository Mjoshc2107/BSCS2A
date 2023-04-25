import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code, name;
        double price, total = 0;
        boolean addMore;

        do {
            System.out.print("Enter item code: ");
            code = input.nextLine();
            System.out.print("Enter item name: ");
            name = input.nextLine();
            System.out.print("Enter item price: ");
            price = input.nextDouble();
            total += price;
            input.nextLine(); // consume the newline character
            System.out.print("Add another item? (y/n): ");
            addMore = input.nextLine().equalsIgnoreCase("y");
        } while (addMore);

        System.out.println("\nItem List:");
        System.out.println("Code\tName\tPrice");
        System.out.println("--------------------------");
        // TODO: print the list of items with their code, name and price

        System.out.printf("Total price: $%.2f\n", total);
    }
}
