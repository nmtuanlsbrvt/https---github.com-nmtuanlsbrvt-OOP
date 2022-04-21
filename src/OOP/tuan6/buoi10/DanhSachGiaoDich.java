package oop.tuan6.buoi10;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<GiaoDich> danhSach = new ArrayList<>();

    private int soLuongGiaoDichDat;
    private int soLuongGiaoDichNha;
    public int getSoLuongGiaoDichDat() {
        return soLuongGiaoDichDat;
    }
    public void setSoLuongGiaoDichDat(int soLuongGiaoDichDat) {
        this.soLuongGiaoDichDat = soLuongGiaoDichDat;
    }
    public int getSoLuongGiaoDichNha() {
        return soLuongGiaoDichNha;
    }
    public void setSoLuongGiaoDichNha(int soLuongGiaoDichNha) {
        this.soLuongGiaoDichNha = soLuongGiaoDichNha;
    }

    public void them(GiaoDich giaoDich){
        danhSach.add(giaoDich);
    }

    public void inDanhSach(){
        for (GiaoDich giaoDich : danhSach) {
            System.out.println(giaoDich);
        }
    }

    public void tinhTongSLTungLoai(){
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                this.soLuongGiaoDichDat++;
            }else{
                this.soLuongGiaoDichNha++;
            }
        }
    }
    
    public double tinhTongTBGDDat(){
        double tienGDDat = 0.0;
        int dem = 0;
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                dem++;
                tienGDDat += giaoDich.tinhTien();
            }
        }
        return tienGDDat/dem;
    }

    
}
