package DynamicProgram;

/**
 * Created by kaling on 11/12/15.
 * 动态规划示例，
 * 钢条切割问题
 * 算法导论P205
 */
public class DynamicProgramDemo01 {

    static class RodCut{

        /**
         * 切割钢条的自顶向下的递归方案
         * @param price 切割获得的总收益
         * @param n 第n次切割
         * @return
         */
        public static int memoizedCutRod(int price, int n){
            int [] bestPrice = new int[n];
            for (int i = 0; i < n; i++){
                bestPrice[i] = -1;
            }
           return memoizedCutRod(price,  n,bestPrice);
        }

        /**
         * 切割钢条的自顶向下的递归方案
         * @param price 切割获得的总收益
         * @param n
         * @param bestPrice
         * @return
         */
        public static int memoizedCutRod(int price, int n, int[] bestPrice){

            return memoizedCutRod(price, n, bestPrice);
        }

    }

}
