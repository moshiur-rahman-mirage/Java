import java.util.Scanner;

public class StaticInitialization {
    static {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        if (breadth <= 0 || height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = breadth * height;
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        // The main method is intentionally left empty as the static block handles the functionality.
    }
}
