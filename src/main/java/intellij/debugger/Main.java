package intellij.debugger;

import intellij.common.TmpClass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int tmpI = 0;
        List<String> arrLst = new ArrayList<>();
        arrLst.add("a1");
        arrLst.add("b2");
        arrLst.add("c3");

        TmpClass tmp = new TmpClass(1, "hello");
        System.out.println(tmp.a);
        tmp.calculate(5);

        tmpI++;
        for (String i: arrLst
             ) {
//            if("b2".equals(i)){
                System.out.println(i);
//            }
        }
        System.out.println("END");
    }
}
