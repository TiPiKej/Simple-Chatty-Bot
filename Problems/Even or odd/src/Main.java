import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;
        while(scanner.hasNextInt() && (temp = scanner.nextInt()) != 0){
            System.out.println(temp % 2 == 0? "even" : "odd");
        }
    }
}