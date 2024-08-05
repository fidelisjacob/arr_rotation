public class arrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 4;
        int[] newArray = rotLeft(array, d);
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + (n - d)) % n; // Formula for calculating new index after rotation
            rotatedArray[newIndex] = a[i];
        }
        return rotatedArray;
    }
}
