import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        boolean canBe = false;

        for (int i = 1; i <= n; i++) {
            if (i * m == k) {
                canBe = true;
                break;
            }
        }

        if (!canBe) {
            for (int i = 1; i <= m; i++) {
                if (i * n == k) {
                    canBe = true;
                    break;
                }
            }
        }

        System.out.print(canBe ? "YES" : "NO");
    }
}