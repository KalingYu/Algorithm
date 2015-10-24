package ShellSort;

import java.util.Arrays;

/**
 * Created by kaling on 10/20/15.
 * 希尔排序
 */
public class ShellSort {
    //将数组a按升序排列
    public static void shellSort(Comparable [] a){
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = 3*h + 1;
        }
        while (h >= 1){
            //将数组变为h有序
            for (int i = h; i < N; i++){
                //将a【i]】插入到a[i-h], a[i-2*h], a[i-
                // 3*h]……之中
                for (int j = i; j >= h && less(a[j], a[j-h]); j-=h)
                    exchange(a, j, j-h);
            }
            h = h/3;
        }

    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable [] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String [] args){
        Integer [] a = {1, 234, 45, 6546346,4645624, 3453, 2345};

        shellSort(a);
        System.out.println(Arrays.toString(a));

    }
}
