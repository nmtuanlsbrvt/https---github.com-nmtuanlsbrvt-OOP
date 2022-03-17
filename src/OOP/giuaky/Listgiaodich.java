package oop.giuaky;

public class Listgiaodich extends Giaodichnhadat{
    Giaodichnhadat[] GD = new Giaodichnhadat[50];
    private int  countGD = 0;
    private double sumdt1 = 0, sumdt2 = 0;
    private float tb = 0;

    public void ListGD(){
        for(int i=1; i < 50; i++){
            GD[i] = new Giaodichnhadat();
        }
    }
    
    public void nhapGDDat(String loaiDat){
        if(countGD > 50){
            System.out.println("Du lieu khong dc qua 50 GD! ");

        } else {
            if(getLoaiDat.equalsIgnoreCase("B")  ||getLoaiDat.equalsIgnoreCase ("C"))
            sumdt1 = getDienTich()*getDonGia();
        } else(getLoaiDat.equalsIgnoreCase("A"){
            sumdt1 = getDienTich()*getDonGia()*1,5;
        }
    }
    public void nhapGDNha(String loaiNha){
        if(countGD > 50){
            System.out.println("Du lieu khong dc qua 50 GD! ");
        
    } else {
        if(getLoaiNha.equalsIgnoreCase("cao cap")){
            sumdt2 = getDienTich()*getDonGia();
            
        } else(getLoaiNha.equalsIgnoreCase("thuong")) {
            sumdt2 = getDienTich()*getDonGia()*0,9;
        }
        
        public void xuatDSGiaoDich(){
            for(int i = 0; i < this.countCX; i++){
                System.out.println("----------------------");
                System.out.println(CX[i].toString());
            }
            System.out.println("----------Tong doanh thu------------");
            System.out.println("Giao dich dat: " + sumdt1);
            System.out.println("Giao dich nha: " + sumdt2);
            System.out.println("Trung binh giao dich dat"+ tb);
        }
    }
    public int tinhTrungBinhDat(){
        tb = (float) ((sumdt1 + sumdt2)/2);
        return tb;
    }
     
}
}
