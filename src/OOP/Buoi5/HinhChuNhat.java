package oop.Buoi5;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public String getChieuDai(){
        return chieuDai;
    }
    
    public void setChieuDai(Double chieuDai){
        this.chieuDai = chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    
    public void setChieuRong(Double chieuRong){
        this.chieuRong = chieuRong;
    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }
    public String to_String(){
        String string = "Chieu dai: " +   this.chieuDai + "Chieu rong: " + this.chieuRong;
        string += "Chu vi: " + this.tinhChuVi() +  "dientich: " + this.tinhDienTich();
        return string;
    }