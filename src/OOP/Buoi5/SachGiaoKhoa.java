package oop.Buoi5;

public class SachGiaoKhoa extends Sach{
    protected String tinhTrang;
    protected double thanhTien;

    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SachGiaoKhoa(){}

    @Override
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        super.nhapDS();
        System.out.print("Tinh trang(cu/moi): ");
        setTinhTrang(sc.nextLine());
        if(this.tinhTrang.equalsIgnoreCase("moi")){
            this.thanhTien = this.soLuong*this.donGia;
        }else{
            this.thanhTien = this.soLuong*this.donGia*0.5;
        }
    }
    @Override
    public String toString() {
        return "SachGiaoKhoa [thanhTien=" + thanhTien + ", tinhTrang=" + tinhTrang + "]";
    }

    
    

    
}
