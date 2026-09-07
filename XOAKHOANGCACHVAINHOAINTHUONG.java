
import java.util.Scanner;

public class XOAKHOANGCACHVAINHOAINTHUONG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String sc = scanner.nextLine();

        System.out.println("Original: [" + sc + "]");

        String trimmed = sc.trim();
        System.out.println("Trimmed: [" + trimmed + "]"); // xóa khoảng trắng của dòng chữ

        System.out.println("Upper:   " + trimmed.toUpperCase()); // in hoa
        System.out.println("Lower:   " + trimmed.toLowerCase()); // in thường

        System.out.println("Original length = " + sc.length());
        System.out.println("Length after trim = " + trimmed.length());

        scanner.close();
    }
}
