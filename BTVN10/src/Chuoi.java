import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chuoi {
    // bài 1
    void checkSubString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi A: ");
        String A = sc.nextLine();
        System.out.print("Nhập chuỗi B: ");
        String B = sc.nextLine();
        if (A.contains(B)) {
            System.out.println("\nA chứa B");
        } else {
            System.out.println("\nA không chứa B");
        }
    }

    // bài 2
    void loaiBoKiTu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi A: ");
        String a = sc.nextLine();
        System.out.println(unique(a));
    }

    String unique(String s) {
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) < 0) {
                str += s.charAt(i);
            }
        }
        return str;
    }

}
