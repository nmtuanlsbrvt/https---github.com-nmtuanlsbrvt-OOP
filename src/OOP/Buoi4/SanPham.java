package oop.Buoi4;

import java.util.ArrayList;

public class SanPham {
    private String tenSP;
    private double donGia, giamGia;
    Scanner sc = new Scanner(System.in);
    List<SanPham> list = new ArrayList<>();

    public String getTenSP(){
        return tenSP;
    }
    
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    public double getDonGia(){
        return donGia;
    }
    
    public void setDonGia(Double donGia){
        this.donGia = donGia;
    }
    public double getGiamGia(){
        return giamGia;
    }
    
    public void setGiamGia(Double giamGia){
        this.giamGia = giamGia;
    }
    public SanPham(){
    }
    public SanPham(String tenSP. double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia){
        this(tenSP,donGia,0);
    }
    private double getThueNhapKhau(){
        return 0.1*donGia;
    }
    public void xuat(){
        System.out.println("Nhập Tên Sản Phẩm: ");
        this.tenSP = sc.nextLine();
        System.out.println("Nhập Đơn Giá Sản Phẩm: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhập Giảm Giá Sản Phẩm: ");
        this.giamGia = sc.nextDouble();
    } 

    public void xuat(){
        System.out.printf("%-9S %15.3fVNĐ %15.3fVNĐ %15.3fVNĐ\n", this.getTenSP(), this.getDonGia(), this.getGiamGia(), this.getThueNhapKhau());
    }

    public void inThongTin(){
        System.out.println("==============================THÔNG TIN SẢN PHẨM=================================");
        System.out.printf("%-20S %-20S %-20S %-20S\n", "tên sản phẩm", "đơn giá", "giảm giá", "thuế nhập nhẩu");
    }

    public void NhapThem(){
        System.out.println("Nhâp Số Lượng SP Muốn Thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);            
        }
    }

    public void xuatThongTin(){
        System.out.printf("%-20S %-20S %-20S %-20S\n", "tên sản phẩm", "đơn giá", "giảm giá", "thuế nhập nhẩu");
        for (SanPham sanPham : list) {
            sanPham.xuat();
        }
    }
}
