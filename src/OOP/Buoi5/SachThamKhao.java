package oop.Buoi5;

public class SachThamKhao extends Sach {
    protected double thue;
    protected double thanhTien;

    public double getThue() {
        return thue;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        super.nhapDS();
        System.out.print("Nhap thue: ");
        setThue(sc.nextDouble());
        this.thanhTien = this.donGia*this.soLuong+this.thue;
    }
    @Override
    public String toString() {
        return "SachThamKhao [thanhTien=" + thanhTien + ", thue=" + thue + "]";
    }
    public double getDonGia() {
        return 0;
    }
        


    


    
}
