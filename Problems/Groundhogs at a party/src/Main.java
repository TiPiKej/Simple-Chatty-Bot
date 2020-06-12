import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        boolean res = b ? a >= 15 && a <= 25 : a >= 10 && a <= 20;
        System.out.print(res);
    }
}