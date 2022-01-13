package OOP.Buoi2;

import java.util.Scanner;

public class Sinhvien {
    int id;
    String ten;
    double diemTB;
    Scanner sc = new Scanner(System.in);

    void nhapThongTin() {
        System.out.print("\tNhap id: ");
        id = sc.nextInt();
        System.out.print("\tNhap ten: ");
        sc.nextLine();
        ten = sc.nextLine();
        System.out.print("\tNhap diem trung binh: ");
        diemTB = sc.nextDouble();
    }
    void hienThiThongTin() {
        System.out.println("\tId: " + id);
        System.out.println("\tTen: " + ten);
        System.out.println("\tDiem trung binh: " + diemTB);
    }
}
