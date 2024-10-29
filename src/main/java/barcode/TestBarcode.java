package barcode;

import java.util.ArrayList;

public class TestBarcode {
    public static void main(String[] args) {
        String barcode = "BarCode";
        String barcode1 = "Bar123";
        String barcode2 = "1902270001";

        System.out.println(convert2Barcode(barcode2));
        System.out.println(convertToCode128C(barcode2));

    }

    static String convert2Barcode(String content){
        System.out.println("before convert to barcode content: " + content);
        int bcStartB = 104;
        int total = bcStartB;
        int bcStop = 106;
        for(int i=0; i<content.length(); i++){
            int asciiValue = (int)content.charAt(i);
            int bcValue = asciiValue - 32;
            total += bcValue*(i+1);
        }
        int bcCheck = total%103;

        char[] startB = {(char) (201)};
        StringBuffer sb = new StringBuffer();
        //add Start character
        sb.append(new String(startB));

        //add data
        for(int i=0; i<content.length(); i++){
            sb.append(content.charAt(i));
        }

        //add Check character
        System.out.println("bcCheck (initial, after %103) = " + bcCheck);
        bcCheck += 32;
        if (bcCheck > 126) {
            bcCheck += 65;
        }
        char[] check = {(char) (bcCheck)};

        sb.append(new String(check));

        //add Stop character
        char[] stop = {(char) (203), (char) (205)};
        sb.append(new String(stop));
        System.out.print("after convert to barcode content: " + sb.toString() + "    hex: " );
        char[] ch =  sb.toString().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c = ch[i];
            System.out.print(Integer.toHexString(c).toUpperCase() + " ");
        }
        System.out.println("");
        return sb.toString();
    }

    static String convertToCode128C(String sInputString){

        int iSum = 105;                                  /* '105' - Start Code C, '104' - Start Code B */
        int iSumMod103 = 0;
        int iCkSum = 0;

        int nStrep = 0;
        int ConvertedNumber = 0;
        int nLenInpString = sInputString.length();
        ArrayList<Integer> alRes = new ArrayList<Integer>();
        StringBuffer bc128c = new StringBuffer();

        char[] startChar = {(char)(202)};                 /* "Ê"  - start character for Code 128C */
        char[] stopChar = {(char)(203), (char)(205)};     /* "ËÍ" - termination bar */

        System.out.println("Before convert to barcode InputString = [" + sInputString + "] and Lenght="+ nLenInpString);

        if((nLenInpString%2) != 0){
            sInputString = sInputString.concat("0");
        }

        while(nStrep < sInputString.length()){
            try{
                ConvertedNumber = Integer.parseInt(sInputString.substring(nStrep, nStrep+2).trim());
                if ( ConvertedNumber == 0 ){
                    alRes.add(ConvertedNumber + 204);
                }
                else if ( ConvertedNumber < 95 ){
                    alRes.add(ConvertedNumber + 32);
                }
                else if ( ConvertedNumber < 106 ){
                    alRes.add(ConvertedNumber + 97);
                }
            }catch(NumberFormatException nfe){
                System.out.println("Skip non digit characters [" + sInputString.substring(nStrep, nStrep+2) + "]");
            }
            finally {
                nStrep+=2;
            }
        }

        for (int iK=0; iK < alRes.size(); iK++)	{
            if( alRes.get(iK) > 32 && alRes.get(iK) < 127 )	{
                iSum += ((alRes.get(iK)-32)*(iK+1));
                //System.out.format( "alRes.get(iK)(1)=[%d], iK=[%d], ((alRes.get(iK)-32)*iK)=[%d],iSum=[%d]\n",alRes.get(iK), (iK+1), (alRes.get(iK)-32)*(iK+1), iSum );
            }
            else if( alRes.get(iK) > 191 && alRes.get(iK) < 197 ) {
                iSum += ((alRes.get(iK)-97)*(iK+1));
                //System.out.format( "alRes.get(iK)(2)=[%d], iK=[%d], ((alRes.get(iK)-32)*iK)=[%d],iSum=[%d]\n",alRes.get(iK), (iK+1), (alRes.get(iK)-97)*(iK+1), iSum );
            }
            else {
                iSum += 0;
                //System.out.format( "alRes.get(iK)(3)=[%d], iK=[%d], ((alRes.get(iK)-32)*iK)=[%d],iSum=[%d]\n",alRes.get(iK), (iK+1), (alRes.get(iK)*(iK+1)), iSum );
            }
        }

        iSumMod103 = iSum/103;
        iCkSum = iSum - iSumMod103*103;

        if( iCkSum == 0 ){ /* the SPACE char */
            iCkSum=204;
        }
        else if( iCkSum < 95 ){
            iCkSum+=32;
        }
        else if( iCkSum < 103 ){
            iCkSum+=97;
        }

        bc128c.append(new String(startChar));
        bc128c.append(convArrListToString(alRes));
        bc128c.append((char)iCkSum);
        bc128c.append(new String(stopChar));

        System.out.println("Barcode string: " + bc128c.toString());

        return bc128c.toString();


    }

    static String convArrListToString(ArrayList<Integer> numbers) {
        StringBuilder builder = new StringBuilder();
        for (int number : numbers) {
            builder.append((char)number);
        }
        //builder.setLength(builder.length());
        return builder.toString();
    }

}
