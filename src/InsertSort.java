/**
 *
 * 插入排序的 demo
 */
public class InsertSort {

    public static int[] insertSort(int [] arr) {
        int insertNode;
        int i,j;


        for (i = 1; i < arr.length; i++) {
            insertNode = arr[i];
            j = i-1;
            while (j>=0 && insertNode < arr[j]){
                arr[j+1] = arr[j]; //如果 insertNode 大于 arr【j】,就向左移动一个数据
                j--;
            }
            arr[j+1] = insertNode;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1, 35, 3, 43, 23, 55};
        InsertSort.insertSort(arr);
        System.out.println(arr[2]);
    }

}
