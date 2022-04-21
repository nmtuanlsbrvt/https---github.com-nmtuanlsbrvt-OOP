package oop.tuan6.buoi10;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
    private char loaiDat;

    public char getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhTien() {
        double tien;
        if(this.loaiDat == 'C' && this.loaiDat =='B'){
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() + this.getDonGia()*1.5;
        }
            return tien;
    }

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat [loaiDat=" + loaiDat + super.toString();
    }
    
    
    
    


    
}
