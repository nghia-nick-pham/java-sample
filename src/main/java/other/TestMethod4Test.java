package other;

public class TestMethod4Test {
    public static void main(String[] args) {

        System.out.println(formatTitre("abc xyz.docx"));
    }

    private static String formatTitre(String t) {
        if (t == null) {
            return "";
        }
        StringBuffer b = new StringBuffer(t);
        for (int i = b.length() - 1; i >= 0; i--) {
            char ch = b.charAt(i);
            if (ch == ' ') {
                b.setCharAt(i, '_');
            } else if (ch == '\'' || ch == '\"') {
                b.deleteCharAt(i);
            }
        }
        return b.toString();
    }
}
