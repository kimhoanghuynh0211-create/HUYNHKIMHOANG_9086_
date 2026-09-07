
import java.util.Scanner;

public class NHAPCHUOITUVANHAPTUCANCHE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap cau van: ");
        String cauVan = sc.nextLine();

        System.out.print("Nhap tu can che: ");
        String tuCanChe = sc.nextLine();

        StringBuilder sao = new StringBuilder();
        for (int i = 0; i < tuCanChe.length(); i++) {
            sao.append("*");
        }

        String ketQua = cauVan.replace(tuCanChe, sao.toString());

        System.out.println("Da che: " + ketQua);

        sc.close();
    }
}
