package java_algorithm.dynamic_programming.knapsack_0_1;

public class KnapSack {
    private static int[] w = new int[]{3,2,6,6,2};
    private static int[] v = new int[]{10,9,5,6,4};
//private static int[] w = new int[]{10, 20, 30};
//    private static int[] v = new int[]{60, 100, 120};

    public static void main(String[] args) {

        int tarWeight = 5;
//        int tarWeight = 50;

        KnapSack knapSack = new KnapSack();
        System.out.println(knapSack.doKnapSack(tarWeight, w.length ));
    }
    int maxObjects(int a, int b){
        return a >b?a:b;
    }
    //noOfItem: n
    int doKnapSack(int tarWeight, int n){
        //base case
        if(tarWeight == 0 || n == 0){
            return 0;
        }
        if(w[n-1] > tarWeight){
            return doKnapSack(tarWeight, n-1 );
        }
        else{
            int tmp1 = v[n-1] + doKnapSack(tarWeight - w[n-1], n-1);
            int tmp2 = doKnapSack(tarWeight, n-1);
            return maxObjects(tmp1,tmp2);
        }
    }
}
