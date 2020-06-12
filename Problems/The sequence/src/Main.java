import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int temp, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            temp = scanner.nextInt();
            if(temp % 4 != 0) continue;
            if(temp > max) max = temp;
        }

        System.out.print(max);
    }
}