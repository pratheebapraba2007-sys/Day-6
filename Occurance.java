public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 10, 40, 20, 20, 10};
        int target = 10;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }

        System.out.println("Output = " + count);
        System.out.println(target + " occurs " + count + " times");
    }
}
