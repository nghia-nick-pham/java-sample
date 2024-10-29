package leetcode_75.string.palyndrome.longest_palindrome;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        String result = "";
        StringBuilder strTmp;

        for (int i = 0; i < s.length() ; i++) {
            strTmp = new StringBuilder();
            strTmp.append(s.charAt(i));
            if (isPalindrome(strTmp.toString())) { //check is Palindrome
                if (result.length() < strTmp.toString().length()) { //Super long comparing
                    result = strTmp.toString();
                }
            }
            for (int j = i+1; j < s.length() ; j++) {
                strTmp.append(s.charAt(j)); //Itegrate through all substrings
                if (isPalindrome(strTmp.toString()) && strTmp.length()>result.length()) { //check is Palindrome ////only evaluate substring length is larger than current result length.
                    if (result.length() < strTmp.toString().length()) { //Super long comparing
                        result = strTmp.toString();
                    }
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String newString = builder.toString();
        int left = 0;
        int right = newString.length() - 1;
        while (right >= left) {
            if (newString.charAt(left) != newString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static void main(String[] args) {
//        String input1 = "babad";
//        String input2 = "cbbd";
//        String input3 = "a";
//        String input4 = "ac";
//        String input5 = "aacabdkacaa";
        String input6 = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";

        LongestPalindrome longestPalindrome = new LongestPalindrome();
//        System.out.println(longestPalindrome.longestPalindrome(input1)); //"bab"
//        System.out.println(longestPalindrome.longestPalindrome(input2)); //"bb"
//        System.out.println(longestPalindrome.longestPalindrome(input3)); //"a"
//        System.out.println(longestPalindrome.longestPalindrome(input4)); //"a"
//        System.out.println(longestPalindrome.longestPalindrome(input5)); //"aca"
        System.out.println(longestPalindrome.longestPalindrome(input6)); //
    }
}
