package OOP.Buoi2;

import java.util.Scanner;

public class StudentGDU {
    Boolean gioitinh;
    int tuoi;
    String Hovaten;
    String khoa;
    double diemTB ;

    Scanner sc = new Scanner(System.in);

    void nhapThongTin() {
        System.out.println("\tNhap gioi tinh: ");
        gioitinh = sc.nextBoolean();
        System.out.print("\tNhap tuoi: ");
        tuoi= sc.nextInt();
        System.out.print("\tNhap ten: ");
        Hovaten = sc.nextLine();
        System.out.print("\tNhap khoa: ");
        khoa = sc.nextLine();
        System.out.print("\tNhap diem trung binh: ");
        diemTB = sc.nextDouble();
    }
    void hienThiThongTin() {
        System.out.println("\tgioi tinh: "+ gioitinh);
        System.out.println("\ttuoi: " + tuoi);
        System.out.println("\tTen: " + Hovaten);
        System.out.print("\tkhoa: "+ khoa);
        System.out.println("\tDiem trung binh: " + diemTB);
    }


    void hoc(){
    };
    void thi(){
    };
    void dangKyMonHoc(){
    };
    
}
