
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] dsSach = {
            new Book("S001", "Lap trinh Java", "Nguyen Van A"),
            new Book("S002", "Co so du lieu", "Tran Van B"),
            new Book("S003", "Lap trinh C++", "Le Van C")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = sc.nextLine();

        boolean timThay = false;

        for (Book sach : dsSach) {
            if (sach.getMaSach().equalsIgnoreCase(maCanTim)) {
                System.out.println("\nTIM THAY SACH:");
                sach.hienThi();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }

        sc.close();
    }
}

