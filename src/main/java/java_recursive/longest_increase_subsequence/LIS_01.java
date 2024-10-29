package java_recursive.longest_increase_subsequence;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LIS_01 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 10, 2, 1, 9};

        LIS_01 lis_01 = new LIS_01();
        System.out.println(lis_01.findLIST(arr));
    }


    int findLIST(int[] arr){
        int countItemSeq = 0;
        int iniIndexItem = 0;

        countItemSeq = rec(arr);

        if(countItemSeq > 0){
            countItemSeq++;
        }

        return countItemSeq;
    }

    int max(int a, int b){
        return a >= b? a:b;
    }
    int rec (int[] arr){
        int index = 0;
        //base case:
        if(arr.length == 1){
            return 0;
        }

        //exclude a[i]
        int[] arrTmp1 = Arrays.copyOfRange(arr,(index+1), (arr.length));

        //exclude a[i+1]
        int[] arrTmp2 = Arrays.copyOfRange(arr,(index+1), (arr.length));
        arrTmp2[0] = arr[index];

        int  tmp1 = 0;
        int  tmp2 = 0;
        if(arr[index] < arr[index + 1]){
            tmp1 = 1 + rec(arrTmp1);
        }else{
            tmp1 = rec(arrTmp1);
        }
        tmp2 = rec(arrTmp2);
        return max(tmp1, tmp2);
    }
}
