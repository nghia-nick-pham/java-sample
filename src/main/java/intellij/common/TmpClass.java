package intellij.common;

public class TmpClass {
    public int a = 0;
    String b ="";

    public TmpClass() {
    }

    public TmpClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(int a){
        a = 1000 - a;
        System.out.println(a);
    }
}
