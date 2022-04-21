package oop.cuoiky;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa{
    
    public Date ngaySanXuat;
    public Date ngayHetHan;
    private String nhaCungCap;

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
    public void setNgayHetHan(Date ngayHetHan) {

            if (ngayHetHan.after(this.ngaySanXuat) || ngayHetHan.equals(ngaySanXuat)) {
                this.ngayHetHan = ngayHetHan;
            } else {
                System.out.println("Ngày hết hạn phải sau ngày sản xuất!!!");
            }
        } 
        
    
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
   
    public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    protected HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat2, Date ngayHetHan2, String nhaSanXuat){}

    public HangThucPham(String maHang, String tenHang, double soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public boolean tinhHanSuDung(){
        boolean hanSuDung = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            hanSuDung = true;
        } else hanSuDung = false;
        return hanSuDung;
    }
    @Override
    public String toString() {
        return "HangThucPham [ngayHetHan=" + ngayVN.format(ngayHetHan) + ", ngaySanXuat=" + ngayVN.format(ngaySanXuat) + ", nhaCungCap=" + nhaCungCap
                + "]" + super.toString();
    }
    @Override
    public double tinhTien() {
       double giaTien = 0;
       giaTien = getSoLuongTon()*getDonGia()/0.05;
        return giaTien;
    }
    @Override
    protected String danhGiaHangHoa() {
        String danhGia ="";
        if(getSoLuongTon() > 0 && tinhHanSuDung() == true){
            System.out.println("Khó bán");
        }
        return danhGia;
    }
    
    }

    
