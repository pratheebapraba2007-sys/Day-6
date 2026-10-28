import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 20, 40, 20};
        System.out.print("Enter element: ");
        int x = sc.nextInt();

        int first = -1, last = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
