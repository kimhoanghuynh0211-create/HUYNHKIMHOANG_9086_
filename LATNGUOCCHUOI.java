import java.util.Scanner;

public class LATNGUOCCHUOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        System.out.println("Original: " + original);
        
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        
        System.out.println("Reversed: " + sb.toString());
        
        sc.close();
    }
}