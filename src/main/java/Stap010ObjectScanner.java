import java.util.Scanner;

public class Stap010ObjectScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een dier in");
        String invoer = scanner.nextLine();
        System.out.println(invoer.toUpperCase());
        System.out.println(invoer.toLowerCase());
    }



}
