package oop.Buoi5;

public class Khachhang {
    private String maKhachHang;
    private String hoTen;
    private Date ngayRaHoaDon;
    private double donGia;

    public String getMaKhachHang() {
        return maKhachHang;
    }
    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }
    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Khachhang(){}
    @Override
    public String toString() {
        return "Khachhang [donGia=" + donGia + ", hoTen=" + hoTen + ", maKhachHang=" + maKhachHang + ", ngayRaHoaDon="
                + ngayRaHoaDon + "]";
    }

    
    
}
