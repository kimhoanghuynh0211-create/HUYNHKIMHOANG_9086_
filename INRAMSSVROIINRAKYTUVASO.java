package string_01;

import java.util.*;

public class INRAMSSVROIINRAKYTUVASO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA SO NGANH VA MA SO SINH VIEN : ");
        String mssvID = sc.nextLine(); // khởi tạo 
        String catmanganh = mssvID.substring(0, 2); // cắt từ ký từ số 0 đến trước ký tự số 2 
        String catmaso = mssvID.substring(2); // là cắt từ ký tự số 2 đến trở về sau 
        System.out.println("MA NGANH :" + catmanganh);
        System.out.println("MA SO : " + catmaso);
        sc.close();
    }

}
