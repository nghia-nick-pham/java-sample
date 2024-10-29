package java_doc;

import java.io.IOException;
import java.util.*;

/**
 * <h1>Add Two Numbers!</h1>
 * Chuong trinh AddNum trien khai mot ung dung ma
 * cong hai so integer da cho va in chung
 * the output on the screen.
 * <p>
 * <b>Note:</b> Viec cung cap comment thich hop trong chuong trinh giup no tro nen
 * than thien voi nguoi dung hon.
 *
 * @author  Zara Ali
 * @version 1.0
 * @since   2014-03-31
 */
public class AddNum {
    /**
     * Phuong thuc nay duoc su dung de cong hai so. Day la
     * mot form don gian nhat cua phuong thuc, de minh hoa
     * cac su dung cua cac javadoc Tags.
     * @param numA Day la tham so dau tien cua phuong thuc addNum
     * @param numB Day la tham so thu hai cua phuong thuc addNum
     * @return int Tra ve tong cua numA va numB.
     */
    public int addNum(int numA, int numB) {
        return numA + numB;
    }

    /**
     * Day la phuong thuc chinh ma su dung phuong thuc addNum.
     * @param args Unused.
     * @return Nothing.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException
    {

        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);

        System.out.println("Tong cua 10 va 20 la :" + sum);
    }
}