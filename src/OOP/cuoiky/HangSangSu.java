package oop.cuoiky;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangSangSu extends HangHoa{
    
    private String nhaSanXuat;
    private Date ngayNhapKho;

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    protected HangSangSu(){}

    public HangSangSu(String maHang, String tenHang, double soLuongTon, double donGia, String nhaSanXuat2, Date ngayNhapKho2) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }

    protected int kiemTraThoiGianLuuKho(){
        /*
        Date ngayHienTai = new Date();
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        a.setTime(ngayHienTai);
        b.setTime(ngayNhapKho);
        a.get(Calendar.DATE);
        b.get(Calendar.DATE);

        Cái này em coi trên mạng @@!
        */

        return (int) (new Date().getTime() - ngayNhapKho.getTime()) / 100000000;
    }
    @Override
    public String toString() {
        return "HangSangSu [ngayNhapKho=" + ngayVN.format(ngayNhapKho) + ", nhaSanXuat=" + this.nhaSanXuat + "]" + super.toString();
    }
    @Override
    public double tinhTien() {
        double giaTien = 0;
        giaTien = this.getSoLuongTon()*this.getDonGia() /0.1;
        return giaTien;
    }
    @Override
    protected String danhGiaHangHoa() {
        String danhGia = "";
        if(getSoLuongTon()> 50 && kiemTraThoiGianLuuKho() >10){
            danhGia = "Bán chậm!";
        }
        
        return danhGia;
       
    }
    


    
}
