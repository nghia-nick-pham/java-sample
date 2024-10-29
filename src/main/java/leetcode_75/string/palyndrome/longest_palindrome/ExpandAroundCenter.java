package leetcode_75.string.palyndrome.longest_palindrome;

public class ExpandAroundCenter {
//    public class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
            int start = 0, end = 0;

            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i); // odd length palindromes
                int len2 = expandAroundCenter(s, i, i + 1); // even length palindromes
                int len = Math.max(len1, len2);
                if (len > end - start) { //get index start, end
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }

            return s.substring(start, end + 1);
        }

        private int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1;
        }

        public static void main(String[] args) {
            ExpandAroundCenter solution = new ExpandAroundCenter();
            String input = "babad";
            System.out.println(solution.longestPalindrome(input)); // Output: "bab" or "aba"


//            System.out.println(1 - (4-1)/2); //0
//
////            "bacabd"
//            System.out.println(2 - (5-1)/2); //0
//            input = "cbbd";
//            System.out.println(solution.longestPalindrome(input)); // Output: "bb"
//
//            input = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
//            System.out.println(solution.longestPalindrome(input)); // Output: "fklkf"
        }
//    }

}
