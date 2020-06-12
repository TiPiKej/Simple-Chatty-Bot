import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean res = false;

        if(a + b == 20) res = true;
        if(b + c == 20) res = true;
        if(a + c == 20) res = true;

        System.out.print(res);
    }
}