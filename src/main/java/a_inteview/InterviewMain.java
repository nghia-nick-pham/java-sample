package a_inteview;

import java.util.HashMap;

public class InterviewMain {


    public static void main(String[] args) {
        int[] inputArry = new int[]{10, 50, 20, 90, 70};
//        10, 20, 50, 70, 90
        System.out.println(findIndexes_02(inputArry, 100));
    }

        public static int findIndexes_02(int[] inputArray, int targetNum) {
            HashMap<Integer, Integer> tmpMap = new HashMap();
            int tmpNumber = 0;

    //        HastMap<int,int> tmpMap = new HashMap<int,int>();
            for( int i =0; i < inputArray.length; i++){
                tmpNumber = targetNum - inputArray[i];
                if (tmpMap.get(Integer.valueOf(inputArray[i]))  != null){
                        System.out.println("index = " +  tmpMap.get(Integer.valueOf(inputArray[i])));
                        System.out.println("index = " + i + "; ");
                        return 1;
                    }
                tmpMap.put(tmpNumber, i);
            }
            return 0;
        }
//}
//    }
//
//    // Example: inputArray = [10, 2, 30, 4, 50, 90, 6, 80, 70]
//    // targetNum = 100
//    // Print out index = 0 ; index = 5
//    public static int findIndexes(int[] inputArray, int targetNum) {
//        //validator
//        if(inputArray == null || inputArray.length < 0 ){
//            return 0;
//        }
////       int result = 0;
//        //definition
//        for (int i = 0; i < inputArray.length; i++
//             ) {
//            for (int j = i + 1; j < inputArray.length; j++) {
//                if (inputArray[i] + inputArray[j] == targetNum) {
//                    System.out.println("index = " + i + "; ");
//                    System.out.println("index = " + j);
//                    return 1;
//                }
//            }
//        }
//        return 0;
//    }
//            // iterate over the inoutArray elements and print out the indexes of the two numbers that add up to the target number; if there are no such numbers, print out 0 and return 0


}
