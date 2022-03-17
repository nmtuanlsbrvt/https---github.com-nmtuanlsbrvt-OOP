package oop.giuaky;

import java.sql.Date;

public class Giaodichnha extends Giaodichnhadat{
    private String diaChi;
    private String loaiNha;
    
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    protected void nhapGiaoDich(){
        super.nhapGiaoDich();

        System.out.println("Loai nha: ");
        setLoaiNha(input.nextLine());

        System.out.println("Dia chi: ");
        setDiaChi(input.nextLine());
    }
    public void xuatGiaoDichNha(){
        xuatGiaoDich();

        System.out.println("Loai nha: "+ getLoaiNha());

        System.out.println("Dia chi"+ getDiaChi());

    }
    public void Giao_DichNha(){}
    public Giaodichnha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String diaChi,
            String loaiNha) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }
    @Override
    public String toString() {
        return "Giaodichnha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + "]";
    }
    

    
    
}
