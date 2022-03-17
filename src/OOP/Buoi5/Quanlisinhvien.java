package oop.Buoi5;

import oop.Buoi2.Sinhvien;

public class Quanlisinhvien {
    private int maSinhVien;
    private String hoTen;
    private float diemLT, diemTH;

    public Sinhvien(){

    }
    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public Sinhvien(String hoTen. int maSinhVien, float diemLT,float diemTH){
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public double tinhDiemTB(){
        return (this.diemLT + this.diemTH) / 2;
    }
    public String to_String(){
        String string = "thong tin sinh vien" + "MSSV" + getMaSinhVien() + "Ho va ten " + getHoTen() + "DiemLT" + getDiemLT() + "Diem TH" + getDiemTH() + "Diem TB"
        + tinhDiemTB();
        return string;
    }
}
