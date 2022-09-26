import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tafelmaker: Geef de grootte aan:");

        int userInput = Integer.parseInt(scanner.nextLine());

        System.out.print("* | ");

        for (int i = 1; i <= userInput; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---".repeat(userInput));

        outer: for (int i = 1; i <= userInput; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= userInput; j++) {
                //System.out.print(i + ": " + j*i + " ");
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
