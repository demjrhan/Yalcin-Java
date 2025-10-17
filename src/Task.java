import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            sayHelloForGreater7(scanner);
            sayHelloForJohn(scanner);
            findMultipleOf3(scanner);

            /* To check if any of the sequence with parameters [] () is balanced or not, you can use isBalanced method. */
            // e.g System.out.println(isBalanced("[((())()(())]]"));

        }
    }

    private static void findMultipleOf3(Scanner scanner) {
        System.out.print("Enter number of elements in array: ");
        if (!scanner.hasNextInt()) { System.out.println("Invalid size."); scanner.next(); return; }
        int size = scanner.nextInt();
        if (size < 0) { System.out.println("Invalid size."); return; }
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            while (!scanner.hasNextInt()) { System.out.println("Not a number, try again."); scanner.next();}
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements that are multiples of 3:");
        boolean found = false;
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();

    }

    private static void sayHelloForGreater7(Scanner scanner) {
        System.out.print("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid number.");
            scanner.next();
            return;
        }
        int number = scanner.nextInt();
        if (number > 7) System.out.println("Hello");
    }

    private static void sayHelloForJohn(Scanner scanner) {
        System.out.print("Enter a name: ");
        String name = scanner.next().trim();
        if (name.equalsIgnoreCase("John")) System.out.println("Hello, John");
        else System.out.println("There is no such name");
    }

    private static String isBalanced(String brackets) {
        if (brackets == null || brackets.isBlank()) {
            return "Given bracket sequence is empty, please give sequence consists of at least 1 element.";
        }
        brackets = brackets.trim();

        int prevLen;
        do {
            prevLen = brackets.length();
            brackets = brackets.replace("()", "").replace("[]", "");
        } while (brackets.length() != prevLen);

        return brackets.isEmpty() ? "Given bracket sequence is correct." : "Given bracket sequence is incorrect.";
    }
}