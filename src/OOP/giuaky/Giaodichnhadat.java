package oop.giuaky;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Giaodichnhadat {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    Scanner input = new Scanner(System.in);

    protected void nhapGiaoDich(){
        System.out.println("------------Nhap thong tin giao dich----------");
        System.out.println("Ma giao dich: ");
        setMaGiaoDich(input.nextLine());

        System.out.println("Ngay giao dich: ");
        setNgayGiaoDich(input.nextLine());

        System.out.println("Don gia: ");
        setDonGia(input.nextDouble());

        System.out.println("Dien tich: ");
        setDienTich(input.nextDouble());
    }

    private void setNgayGiaoDich(String nextLine) {
    }
    
    public void xuatGiaoDich(){
        System.out.println("----------Thong tin giao dich----------");
        System.out.println("Ma giao dich: "+ getMaGiaoDich());
        System.out.println("Ngay giao dich"+ getNgayGiaoDich());
        System.out.println("Don gia"+ getDonGia());
        System.out.println("Dien tich" + getDienTich());
    }
    public Giaodichnhadat(){

    }
    public Giaodichnhadat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    @Override
    public String toString() {
        SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

        return "Giaodichnhadat [dienTich=" + dienTich + ", donGia=" + donGia + ", maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + ngayVN.format(ngayGiaoDich) + "]";
    }
    
    

    
}
