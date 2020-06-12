import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = (double)scanner.nextInt();
        double p = (double)scanner.nextInt() / 100;
        double k = (double)scanner.nextInt();
        int years = 0;

        while(m < k){
            years++;
            m += m*p;
        }

        System.out.print(years);
    }
}