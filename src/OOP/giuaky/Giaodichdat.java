package oop.giuaky;

import java.sql.Date;

public class Giaodichdat extends Giaodichnhadat {
    private String loaiDat;


    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

   protected void nhapGiaoDich(){
       super.nhapGiaoDich();

       System.out.println("Loai dat: ");
       setLoaiDat(input.nextLine());
   }
   public void xuatGiaoDichDat(){
       xuatGiaoDich();
       System.out.println("Loai dat: " + getLoaiDat());
   }
   public void Giao_DichDat(){}

public Giaodichdat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
    super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
    this.loaiDat = loaiDat;
}

@Override
public String toString() {
    return "Giaodichdat [loaiDat=" + loaiDat + "]";
}




   
    
}
