public class searchString {

    static boolean search(String s,char t)
    {
        if(s.length() == 0)
        {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (t == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Tanay";
        char t = 'b';
        System.out.println(search(name, t));
    }
}
