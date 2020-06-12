import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int temp;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();

            if (max > temp) continue;
            if (temp % 4 == 0) max = temp;
        }

        System.out.print(max);
    }
}
