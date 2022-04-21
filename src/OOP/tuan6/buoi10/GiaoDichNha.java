package oop.tuan6.buoi10;

import java.util.Date;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;
    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    @Override
    public double tinhTien() {
        double tien;
        if(this.loaiNha.equals("CaoCap")){
            tien= this.getDienTich()*getDonGia();
        } else {
            tien= this.getDienTich()*getDonGia()*0.9;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "GiaoDichNha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + super.toString();
    }
    
    
    

    
}
