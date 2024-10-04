public class RotateArrayLeft {
    static void swap(int a[], int j, int i) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, j, i);
                }
            }
        }
        int n = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("this is rotate");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp = a[a.length - 1];
                a[a.length - 1] = a[j];
                a[j] = temp;

                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}