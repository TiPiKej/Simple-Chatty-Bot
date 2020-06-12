import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int temp;
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            temp = scanner.nextInt();
            if(temp % 6 == 0) sum += temp;
        }

        System.out.print(sum);
    }
}