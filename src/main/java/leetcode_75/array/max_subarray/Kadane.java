package leetcode_75.array.max_subarray;

import java.util.Arrays;

public class Kadane {

        public int[] maxSubArray(int[] arr) {
            int start=0,end=0,currStart=0,currEnd=0,currMax=0,max=0;
            for(int i=0;i<arr.length;i++) {
                if(currMax+arr[i]>arr[i]) {
                    currMax+=arr[i];
                    currEnd++;
                }else {
                    currMax=arr[i];
                    currStart=i;
                    currEnd=i+1;
                }
                if(currMax>max) {
                    max=currMax;
                    start=currStart;
                    end=currEnd;
                }
//                Arrays.copyOfRange(arr, start, end);
                System.out.println("i = " + i + "-----------------------");
                System.out.println("start: " + start);
                System.out.println("end: " + end);
                System.out.println("currStart: " + currStart);
                System.out.println("currEnd: " + currEnd);
                System.out.println("currMax: " + currMax);
                System.out.println("max: " + max);

            }


            return Arrays.copyOfRange(arr,start,end);
        }
        public static void main(String[] args) {
            Kadane k=new Kadane();
//            for(int i:k.maxSubArray(new int[]{-1,2,9,-4,-5,6,7})){
//            for(int i:k.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})){
            for(int i:k.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,4,-5,4})){
                System.out.print(i+" ");
            }

        }


}
