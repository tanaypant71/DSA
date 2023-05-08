public class subString {

    public static String substring(String s, int si, int ei) {
        String subs = "";
        for (int i = si; i < ei; i++) {
            subs += s.charAt(i);
        }
        return subs;
    }

    public static void main(String[] args) {
        // SubString
        String s = "HelloWorld";
       System.out.println( s.substring(0, 4));
        //System.out.println(substring(s, 0, 5));
    }
}
