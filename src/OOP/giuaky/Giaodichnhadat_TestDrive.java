package oop.giuaky;

import java.util.Scanner;

public class Giaodichnhadat_TestDrive {
    public static void main(String[] args) {
        Boolean loopCondition = true;

        Scanner input = new Scanner(System.in);
        Listgiaodich dsGD = new Listgiaodich();
    }
    
    do {
        System.out.println("----------------");
        System.out.println("1. Nhap giao dich dat: ");
        System.out.println("2. Nhap giao dich nha: ");
        System.out.println("3. Xuat danh sach giao dich");
        System.out.println("4. Xuat danh sach giao dich thang 9 nam 2013");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("Chon: ");
        int userSelect = input.nextInt();
        switch (userSelect){
            case 0:
            loopCondition = false;
            break;
            case 1:
            dsGD.nhapGDDat();
            break;
            case 2:
            dsGD.nhapGDNha();
            break;
            case 3:
            dsGD.xuatDSGiaoDich();
            break;
            case 4:
            break;
            default:
                break;
        }
        while(loopCondition);
    }
}
