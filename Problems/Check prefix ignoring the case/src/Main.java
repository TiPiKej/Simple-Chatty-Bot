import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        System.out.print(s.charAt(0) == 'j' || s.charAt(0) == 'J');
    }
}
