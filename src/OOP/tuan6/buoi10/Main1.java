package oop.tuan6.buoi10;

import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();

        System.out.println("Nhap ma giao dich: ");
        String maGiaoDich = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Giao dich Dat_1/Giao dich Nha_2");
        int loai= scanner.nextInt();

        GiaoDich giaoDich;
        if(loai ==1){
            giaoDich = new GiaoDichDat(maGiaoDich, new Date(), donGia, 500, 'A');
        } else giaoDich = new GiaoDichNha(maGiaoDich, new Date(), donGia, 200, "Thuong", "Binh Chanh");

        danhSachGiaoDich.them(giaoDich);

        danhSachGiaoDich.inDanhSach();
    }
    
}
