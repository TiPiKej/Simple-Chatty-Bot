import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOrdered = true;
        int order = 0; // 0 - unset, 1 - ascending (or equal to prev), 2 - descending
        int prev = scanner.nextInt();
        int cur;
        while ((cur = scanner.nextInt()) != 0) {
            if (order == 0) { // if order is unset
                order = prev <= cur ? 1 : 2;
            }

            if (order == 1) { // if is ascending
                if(prev > cur) {
                    isOrdered = false;
                    break;
                }
            }

            if (order == 2) { // if is descending
                if(prev <= cur) {
                    isOrdered = false;
                    break;
                }
            }

            prev = cur;
        }

        System.out.print(isOrdered);
    }
}