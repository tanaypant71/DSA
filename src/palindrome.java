public class palindrome {

    public static boolean Palindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            int n = s.length();
            if (s.charAt(i) != s.charAt(n-1-i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(Palindrome(s));
    }
}

//time complexity O(n)
