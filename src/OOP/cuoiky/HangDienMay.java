package oop.cuoiky;

public class HangDienMay extends HangHoa {
    
    private double thoiGianBaoHanh;
    private double congSuat;

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        if(thoiGianBaoHanh >=0){
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        } else {
            System.out.println("Vui lòng nhập thời gian bảo hành >= 0! Xin cảm ơn");
        }

    }
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        if(congSuat >=0){
        this.congSuat = congSuat;
        } else {
            System.out.println("Vui lòng nhập công suất > 0! Xin cảm ơn");
        }

    }

    protected HangDienMay(){}

    public HangDienMay(String maHang, String tenHang, double soLuongTon, double donGia, int thoiGianBaoHanh2, int congSuat2) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.congSuat = congSuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    
    @Override
    public String toString() {
        return "HangDienMay [congSuat=" + congSuat + ", thoiGianBaoHanh=" + thoiGianBaoHanh + "]"+super.toString();
    }

    @Override
    public double tinhTien() {
        double giaTien = 0;
        giaTien = getSoLuongTon()*getDonGia()/0.1;
        return giaTien;
    }

    @Override
    protected String danhGiaHangHoa() {
        String danhGia = "";
        if(getSoLuongTon()<3){
            System.out.println("Bán được");
        }
        return danhGia;
    }
    

    
    
    
}
