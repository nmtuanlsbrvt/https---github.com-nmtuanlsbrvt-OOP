package oop.cuoiky;

import java.io.Serializable;

public abstract class HangHoa implements Serializable {
    public static final String dat = null;
    private String maHang;
    private String tenHang;
    private double soLuongTon;
    private double donGia;
    
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        if(maHang != null){
        this.maHang = maHang;
        } else {
            System.out.println("Mã hàng không được để trống");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
        this.tenHang = tenHang;
        } else {
            System.out.println("Tên hàng không được rỗng");
        }
    }

    public double getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(double soLuongTon) {
        if(soLuongTon >= 0){
        this.soLuongTon = soLuongTon;
        } else {
            System.out.println("Vui lòng nhập số lượng tồn >= 0! Xin cảm ơn!");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        } else {
            System.out.println("Vui lòng nhập đơn giá > 0! Xin cảm ơn. ");
        }
    }

    public HangHoa(){}

    public abstract double tinhTien();
    protected abstract String danhGiaHangHoa();


    public HangHoa(String maHang, String tenHang, double soLuongTon, double donGia) {
    }

    @Override
    public String toString() {
        return "HangHoa [donGia=" + donGia + ", maHang=" + maHang + ", soLuongTon=" + soLuongTon + ", tenHang="
                + tenHang + "]";
    }

    

    
    

    





    

    
}
