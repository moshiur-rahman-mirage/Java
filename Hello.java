import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = 0;

        while (sc.hasNext()) {
            lineCount++;
            String line = sc.nextLine();
            System.out.println(lineCount + " " + line);
        }

        sc.close(); // Don't forget to close the scanner
    }
}
