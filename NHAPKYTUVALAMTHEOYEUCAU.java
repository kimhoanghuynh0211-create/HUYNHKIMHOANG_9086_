package string_01;
import java.util.*;

public class NHAPKYTUVALAMTHEOYEUCAU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String s = sc.nextLine();

        System.out.println("Starts with report: " + s.startsWith("report"));
        System.out.println("Ends with .pdf: " + s.endsWith(".pdf"));
        System.out.println("First character = " + s.charAt(0));
        System.out.println("Last character = " + s.charAt(s.length() - 1));

        sc.close();
    }
}
