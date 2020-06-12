import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = scanner.nextInt() < 10;
        System.out.print(res);
    }
}