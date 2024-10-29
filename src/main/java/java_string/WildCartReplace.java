package java_string;

public class WildCartReplace {

    public static void main(String[] args) {
        String strABC = "<<0<pi_SAISINE_rec_dom_I>>au eng remb box22 inf22";

        String strXYZ = strABC.replace("#", "\\#");
        System.out.println(strXYZ);
    }
}
