package MergeData;

import java.util.Arrays;

public class MergeData {
    public static int[] mergeData(int[] a, int m, int[] b, int n) {
        if (a.length == 0 || m == 0 || m + n < a.length ||
                m > a.length || n > b.length)
            throw new IllegalArgumentException("Something went wrong!");
        if (b.length == 0)
            return a;
        if(a[m-1] < b[0]) {
            System.arraycopy(b, 0, a, m, n);
            return a;
        }
        if (a[0] > b[n-1]) {
            System.arraycopy(a, 0, a, n, m);
            System.arraycopy(b, 0, a, 0, n);
            return a;
        }
        else {
            int[] temp = new int[m];
            int i = 0, j = 0, k = 0;
            System.arraycopy(a, 0, temp, 0, m);
            while(i < m && j < n) {
                if (temp[i] < b[j]) {
                    a[k] = temp[i];
                    k++;
                    i++;
                }
                else {
                    a[k] = b[j];
                    k++;
                    j++;
                }
            }
            if (i < m)
                System.arraycopy(temp, i, a, i + j, a.length - k);
            if (j < n)
                System.arraycopy(b, j, a, i + j, a.length - k);
            return a;
        }
    }

    public static void main(String[] args) {
        int[] customerData1 = {101, 104, 107, 0, 0, 0},
                customerData2 = {102, 105, 108},
                customerData3 = {103},
                customerData4 = new int[0];
        System.out.println(Arrays.toString(mergeData(customerData1, 3,
                customerData2, 3)));
        System.out.println(Arrays.toString(mergeData(customerData3, 1,
                customerData4, 0)));
        System.out.println(Arrays.toString(mergeData(customerData1, 1,
                customerData3, 0)));
    }
}
