package java_rest_api;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int year = 2011;
        int result = 0;
        try {
            result = Result.getNumDraws(year);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
