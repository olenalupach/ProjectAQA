package first.statick.hw;

public class hwmax {
    public static void main(String[] args) {
        Object array = new Object();
        Object array1 = array;
        int[] arr = new int[]{2, -5, 7, -4, 8, 21};
        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1));
    }
}