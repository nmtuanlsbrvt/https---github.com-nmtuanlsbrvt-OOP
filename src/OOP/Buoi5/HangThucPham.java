package oop.Buoi5;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngayHetHan;
    private Date ngaySX;
    
    private void setMaHang(String maHang) {
        if(maHang != null){
        this.maHang = maHang;
        }else{
            System.out.println("Ma hang khonng duoc rong");
            this.maHang = "TP";
        }
    public String getMaHang(){
        return maHang;
    }
    }
    private void setTenHang(String tenHang) {
        if(tenHang != null){
        this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khonng duoc rong");
            this.tenHang = "PM";
        }
    public Void setDonGia(Double donGia){
        if(donGia > 0){
            this.donGia = donGia;
    }
    public void setNgayHetHan(Date ngayHetHan){
        if(ngayHetHan != null) 
            if (ngayHetHan.after(this.ngaySX)){
            this.ngayHetHan = ngayHetHan;
            }else{
                System.out.println("Ngay het han phai sau ngay SX");
                this.ngayHetHan = new Date();
            }
    }
    public void setNgaySX(Date ngaySX) {
        if(ngayHetHan != null){
        this.ngaySX = ngaySX;}
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVN = new NumberFormat.getCurrencyInstance(localeVN);
        return "HangThucPham [donGia=" + tienVietNam.format(donGia) + ", maHang=" + maHang + ", ngayHetHan=" +ngayVietNam.format(ngayHetHan)  + ", ngaySX="
                +ngayVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }
    public HangThucPham(){}

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }
    public void soSanhNgayHetHan(){
        if(ngayHetHan < new Date()){
        System.out.println("Hang da het han su dung");}
    }
}
