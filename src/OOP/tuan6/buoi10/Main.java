package oop.tuan6.buoi10;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GiaoDichDat giaoDichDat = new GiaoDichDat("GD1", new Date(), 500, 700, 'A');
        GiaoDichDat giaoDichDat2 = new GiaoDichDat("GD2", new Date(), 200, 700, 'B');

        GiaoDichNha giaoDichNha = new GiaoDichNha("GN1", new Date(),1_000_000_000, 500, "CaoCap", "Quan1");

        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        danhSachGiaoDich.them(giaoDichDat);
        danhSachGiaoDich.them(giaoDichNha);
        danhSachGiaoDich.them(giaoDichDat2);

        danhSachGiaoDich.inDanhSach();

        danhSachGiaoDich.tinhTongSLTungLoai();

        System.out.println("Dat: "+ danhSachGiaoDich.getSoLuongGiaoDichDat());
        System.out.println("Tong GD dat: "+ danhSachGiaoDich.tinhTongTBGDDat());


    }
    
}
