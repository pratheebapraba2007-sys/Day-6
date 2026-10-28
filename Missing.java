public class Main {
    public static void main(String[] args) {
        int a[] = {5, 3, -1, 2, 1, 8};

        for (int num = 1; num <= a.length + 1; num++) {
            boolean found = false;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == num) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Output = " + num);
                break;
            }
        }
    }
}
