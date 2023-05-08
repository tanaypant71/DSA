import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String s1 = "abcd tanay";
        String s2 = new String("xyz");

        // Strings are IMMUTABLE
        // String is a class

        // Scanner sc = new Scanner(System.in);
        String name;
        // .next() only takes a single word
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(s1.length());

        // concatination
        String fname = "Tanay";
        String lname = "Pant";
        String fullname = fname + " " + lname;
        // System.out.println(fullname.charAt(0));
        printLetters(fullname);
    }

    public static void printLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }
}
