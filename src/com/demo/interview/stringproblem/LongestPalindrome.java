package com.demo.interview.stringproblem;

public class LongestPalindrome {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("whdqcudjpisufnrtsyupwtnnbsvfptrcgvobbjglmpynebblpigaflpbezjvjgbmofejyjssdhbgghgrhzuplbeptpaecfdanhlylgusptlgobkqnulxvnwuzwauewcplnvcwowmbxxnhsdmgxtvbfgnuqdpxennqglgmspbagvmjcmzmbsuacxlqfxjggrwsnbblnnwisvmpwwhomyjylbtedzrptejjsaiqzprnadkjxeqfdpkddmbzokkegtypxaafodjdwirynzurzkjzrkufsokhcdkajwmqvhcbzcnysrbsfxhfvtodqabvbuosxtonbpmgoemcgkudandrioncjigbyizekiakmrfjvezuzddjxqyevyenuebfwugqelxwpirsoyixowcmtgosuggrkdciehktojageynqkazsqxraimeopcsjxcdtzhlbvtlvzytgblwkmbfwmggrkpioeofkrmfdgfwknrbaimhefpzckrzwdvddhdqujffwvtvfyjlimkljrsnnhudyejcrtrwvtsbkxaplchgbikscfcbhovlepdojmqybzhbiionyjxqsmquehkhzdiawfxunguhqhkxqdiiwsbuhosebxrpcstpklukjcsnnzpbylzaoyrmyjatuovmaqiwfdfwyhugbeehdzeozdrvcvghekusiahfxhlzclhbegdnvkzeoafodnqbtanfwixjzirnoaiqamjgkcapeopbzbgtxsjhqurbpbuduqjziznblrhxbydxsmtjdfeepntijqpkuwmqezkhnkwbvwgnkxmkyhlbfuwaslmjzlhocsgtoujabbexvxweigplmlewumcone"));
    }

    public static String longestPalindrome(String s) {
        String res = s.substring(0,1);
        int currIdx = s.length()-1;
        while (currIdx >= 0) {
            String str = s.substring(0, currIdx+1);
            if (checkPalindrome(str)) {
                res = str;
                break;
            }
            currIdx--;
        }
        currIdx = 1;
        while (currIdx+res.length() < s.length()) {
            int endIdx = s.length() -1;
            while (endIdx >= (currIdx+res.length())) {
                String str = s.substring(currIdx,endIdx+1);
                if (checkPalindrome(str) && str.length() > res.length()) {
                    res = str;
                    break;
                }
                endIdx--;
            }
            currIdx++;
        }
        return res;
    }

    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        boolean isPalindrome = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }

}
