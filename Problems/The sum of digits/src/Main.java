import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();

        int hundreds = nbr / 100;
        int tens = (nbr - hundreds * 100) / 10;
        int units = nbr - hundreds * 100 - tens * 10;

        System.out.print(hundreds + tens + units);
    }
}