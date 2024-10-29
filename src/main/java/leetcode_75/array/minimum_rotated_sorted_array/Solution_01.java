package leetcode_75.array.minimum_rotated_sorted_array;

public class Solution_01 {
    public static void main(String[] args) {
        Solution_01 sol = new Solution_01();
//        System.out.println(sol.findMinimum(new int[]{3, 4, 5, 7, 0, 1, 2}));
        System.out.println(sol.findMinimum(new int[]{0,1,2,4,5,6,7}));
//        System.out.println(sol.findMinimum(new int[]{3,4,5,1,2}));
//        System.out.println(sol.findMinimum(new int[]{11,13,15,17}));
    }



    int findMinimum(int[] arr){
        int l = 0;
        int r = arr.length -1;
        int m =(l + r) / 2;
        do {

        if (arr[m] >= arr[r]) {
            l = m;

        }else{
            r = m;
        }
            m = (l + r) / 2;
        if (m == l || m == r){
            if (arr[r] <= arr[l]){
                m = r;
            }else{
                m = l;
            }
        }
        }while(m != l && m != r);


        return arr[m];
    }
}
