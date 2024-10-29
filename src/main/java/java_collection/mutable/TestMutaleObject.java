package java_collection.mutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class C1{
    private String p1;
    private List<String> p2;
    C1 (String p1, List<String> p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public List<String> getP2() {
        return p2;
    }

    public void add(String s) {
        this.p2.add(s);
    }

    public void setP2(List<String> p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "C1{" +
                "p1='" + p1 + '\'' +
                ", p2=" + Arrays.toString(p2.toArray()) +
                '}';
    }
}
public class TestMutaleObject {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("p2_01_val");
        lst.add("p2_02_val");

        C1 c1 = new C1("p1_val", lst);
        int p1 = 1;
        //
        TestMutaleObject testMutaleObject = new TestMutaleObject();
        testMutaleObject.updateObject(c1);
        System.out.println(c1.toString()); //expected: C1{p1='p1_val', p2=[p2_01_val, p2_02_val, p2_03_val]}
        //
        testMutaleObject.updateVal(p1);
        System.out.println(p1);  // expected: 1
    }
    void updateObject(C1 c1){
        c1.setP1("p1_val_upated");
        c1.add("p2_03_val");
    }
    void updateVal(int p1){
        p1++;
    }

}
