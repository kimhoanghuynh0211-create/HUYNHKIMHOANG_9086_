
import java.util.ArrayList;

public class XOAPHANTUVADEMPHANTUCONLAI {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Before: " + names);

        String removedName = names.remove(1); // khởi tạo hàm xóa phần tử số 1 
        System.out.println("Removed: " + removedName); // in ra phần tử bị xóa 

        System.out.println("After: " + names);
        System.out.println("Size: " + names.size()); // đếm lại phần tử còn lại 
    }
}
