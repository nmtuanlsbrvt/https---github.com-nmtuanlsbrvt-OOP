package oop.cuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    
    private List<HangHoa> danhSach = new ArrayList<>();
    FileWriter filewriter = new FileWriter();
    Consoleinput consoleinput = new Consoleinput();

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

   
  
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    private Date ngayHetHan;
  
    public void themHangHoa(HangHoa hangHoa) {
        this.danhSach.add(hangHoa);
        FileWriter.writeFile("HangHoa.dat", danhSach);
      }
  
    public void docFile(){
      FileWriter.writeFile("HangHoa.dat", danhSach);
    }
  
    public void inThongTinHangHoa() {
      for (HangHoa hangHoa : danhSach) {
        System.out.println(hangHoa);
      }
    }
  
    public void inThongTinThucPham(){
      System.out.println("Thong tin Thuc Pham: ");
      for (HangHoa hangHoa : danhSach) {
        if(hangHoa.getMaHang().contains("T"))
        System.out.println(hangHoa);
      }
    }
  
    public void inThongTinDienMay(){
      System.out.println("Thong tin Dien May: ");
      for (HangHoa hangHoa : danhSach) {
        if(hangHoa.getMaHang().contains("D"))
        System.out.println(hangHoa);
      }
    }
  
    public void inThongTinSanhSu(){
      System.out.println("Thong tin Sanh Su: ");
      for (HangHoa hangHoa : danhSach) {
        if(hangHoa.getMaHang().contains("S"))
        System.out.println(hangHoa);
      }
    }
  
    public void xoaHangHoaTheoMaHang() {
      System.out.println("Nhập mã cần xóa: ");
      String maHangCanXoa = sc1.nextLine();
      HangHoa hangHoa1 = null;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanXoa))
          hangHoa1 = hangHoa;
      }
      if (hangHoa1 != null) {
        danhSach.remove(hangHoa1);
        System.out.println("Xóa thành công!");
      } else {
        System.out.println("Nhập mã sai! Xin vui lòng thử lại");
      }
    }
  
    public void xoaHangHoaTheoTenHang() {
      System.out.println("Nhập tên hàng cần xóa: ");
      String tenHanHoaCanXoa = sc1.nextLine();
      HangHoa hangHoa1 = null;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getTenHang().equalsIgnoreCase(tenHanHoaCanXoa))
          hangHoa1 = hangHoa;
      }
      if (hangHoa1 != null) {
        danhSach.remove(hangHoa1);
        System.out.println("Xóa thành công!");
      } else {
        System.out.println("Nhập tên hàng sai! Xin thử lại.");
      }
    }
  
    public void timHangHoaTheoMa() {
      System.out.println("Nhập mã hàng cần tìm");
      String maHangCanTim = sc1.nextLine();
      HangHoa hangHoa1 = null;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanTim)) {
          hangHoa1 = hangHoa;
          System.out.println("Mã hàng tìm được là:");
          System.out.println(hangHoa1);
        }
      }
    }
  
    public void timHangHoaTheoMaHang(String maHangCanTim) {
      System.out.println("Nhập mã hàng cần tìm");
      maHangCanTim = sc1.nextLine();
      HangHoa hangHoa1 = null;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanTim)) {
          hangHoa1 = hangHoa;
          System.out.println("Mã hàng cần tìm là:");
          System.out.println(hangHoa1);
        }
      }
    }
    public HangHoa timHangHoaTheoMaHangTraVeHangHoa(String maHangCanTim) {
      HangHoa hangHoa =null;
      System.out.println("Nhập mã hàng cần tìm");
      maHangCanTim = sc1.nextLine();
      for (HangHoa hangHoa1 : danhSach) {
        if (hangHoa1.getMaHang().equalsIgnoreCase(maHangCanTim)) {
          hangHoa = hangHoa1;
        }
      }
      return hangHoa;
    }
  
  
    public void timHangHoaTheoTenHang() {
      System.out.println("Nhập tên hàng cần tìm: ");
      String tenHangCanTim = sc1.nextLine();
      HangHoa hangHoa1 = null;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getTenHang().equalsIgnoreCase(tenHangCanTim)) {
          hangHoa1 = hangHoa;
          System.out.println("Tên hàng hóa tìm được là:");
          System.out.println(hangHoa1);
        }
      }
    }
  
    public void sapXepHangHoa() { 
      System.out.println("Hàng hóa đã được sắp xếp!: ");
      Collections.sort(danhSach, (o1, o2) -> o1.getMaHang().compareTo(o2.getMaHang()));
    }
  
    public int timViTriHangHoa(HangHoa hangHoa) {
      int viTri = -1;
      viTri = this.danhSach.indexOf(hangHoa);
      return viTri;
    }
  
    
    public void suaHangHoa(String maHang) throws ParseException{
      int viTri = timViTriHangHoa(timHangHoaTheoMaHangTraVeHangHoa(maHang));
      if(viTri == -1){
        System.out.println("Không tìm thấy hàng hóa phù hợp!!!");
      }else{
        HangHoa hangHoa = consoleinput.suaHangHoa();
        if(hangHoa != null){
          this.danhSach.set(viTri, hangHoa);
          System.out.println("Đã sửa hàng hóa");
        }
      }
     }
    
  
    public void thongKeHangHoa() {
      double tongSLTKThucPham = 0;
      double tongSLTKDienMay = 0;
      double tongSLTKSanhSu = 0;
      double tongDonGiaThucPHam = 0, tongDonGiaDienMay = 0, tongDonGiaSanhSu = 0;
      for (HangHoa hangHoa : danhSach) {
        if (hangHoa.getMaHang().contains("T")) {
          tongSLTKThucPham = tongSLTKThucPham + hangHoa.getSoLuongTon();
          tongDonGiaThucPHam = tongDonGiaThucPHam + hangHoa.getDonGia();
        } else if (hangHoa.getMaHang().contains("D")) {
          tongSLTKDienMay = tongSLTKDienMay + hangHoa.getSoLuongTon();
          tongDonGiaDienMay = tongDonGiaDienMay + hangHoa.getDonGia();
        } else if (hangHoa.getMaHang().contains("S"))
          tongSLTKSanhSu = tongSLTKSanhSu + hangHoa.getSoLuongTon();
        tongDonGiaSanhSu = tongDonGiaSanhSu + hangHoa.getDonGia();
      }
      System.out.println("\tTong so luong hang hoa ton kho");
      System.out.println("Tong SLTK Thuc Pham: " + tongSLTKThucPham);
      System.out.println("Tong SLTK Dien May: " + tongSLTKDienMay);
      System.out.println("Tong SLTK Sanh Su: " + tongSLTKSanhSu);
      System.out.println("\tTong don gia cac loai hang hoa");
      System.out.println("Tong don gia Thuc Pham: " + tongDonGiaThucPHam);
      System.out.println("Tong don gia Dien May: " + tongDonGiaDienMay);
      System.out.println("Tong don gia Sanh Su: " + tongDonGiaSanhSu);
    }
    
  
    public void baoCao(){
      double tongThanhTienThucPham = 0, tongThanhTienDienMay = 0, tongThanhTienSanhSu = 0;
      System.out.println("Tong thanh tien cac loai hang hoa hien co:");
      for(HangHoa hangHoa : danhSach){
        if (hangHoa.getMaHang().contains("T")) {
          tongThanhTienThucPham = tongThanhTienThucPham + hangHoa.tinhTien();
        } else if (hangHoa.getMaHang().contains("D")) {
          tongThanhTienDienMay = tongThanhTienDienMay + hangHoa.tinhTien();
        } else if (hangHoa.getMaHang().contains("S")){
          tongThanhTienSanhSu= tongThanhTienSanhSu + hangHoa.tinhTien();
        }
      }
      System.out.println("Tong thanh tien Thuc Pham: "+tongThanhTienThucPham);
        System.out.println("Tong thanh tien Dien May: "+tongThanhTienDienMay);
        System.out.println("Tong thanh tien Sanh Su: "+tongThanhTienSanhSu);
    }
  
  
    public void moi() throws ParseException {
      SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
      String ngayNhapKho = "21/12/2022";
      String ngaySanXuat = "22/12/2022";
      String ngayHetHang = "12/6/2023";
      HangHoa hh1 = new HangThucPham("T001", "Bánh Mì", 10, 3.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
          "VN");
      HangHoa hh2 = new HangThucPham("T002", "Bắp", 15, 7.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
          "VN");
      HangHoa hh3 = new HangThucPham("T003", "Khoai lang", 25, 5.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
          "VN");
      HangHoa hh4 = new HangThucPham("T004", "Bánh bông lan", 35, 9.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
          "VN");
      HangHoa hh5 = new HangThucPham("T005", "Bánh bơ sữa", 43, 15.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang), "VN");
      HangHoa hh6 = new HangDienMay("D006", "Tivi", 22, 340.000, 12, 36);
      HangHoa hh7 = new HangDienMay("D007", "Máy giặt", 7, 1220.000, 12, 56);
      HangHoa hh8 = new HangDienMay("D008", "Đầu máy", 19, 520.000, 12, 36);
      HangHoa hh9 = new HangSangSu("S009", "Gốm sứ", 14, 23.500, "VN", ngayVN.parse(ngayNhapKho));
      HangHoa hh10 = new HangSangSu("S010", "Đĩa sứ", 35, 6.500, "VN", ngayVN.parse(ngayNhapKho));
      HangHoa hh11 = new HangSangSu("S011", "Chén sứ", 24, 12.500, "VN", ngayVN.parse(ngayNhapKho));
      themHangHoa(hh1);
      themHangHoa(hh2);
      themHangHoa(hh3);
      themHangHoa(hh4);
      themHangHoa(hh5);
      themHangHoa(hh6);
      themHangHoa(hh7);
      themHangHoa(hh8);
      themHangHoa(hh9);
      themHangHoa(hh10);
      themHangHoa(hh11);
    }
  }
