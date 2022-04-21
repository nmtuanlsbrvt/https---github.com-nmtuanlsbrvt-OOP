package oop.cuoiky;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Consoleinput {
    public Scanner sc1 = new Scanner(System.in);
    public Scanner sc2 = new Scanner(System.in);
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
    private int soLuongTon;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    protected int thoiGianBaoHanh;
    private Date ngayNhapKho;

    public HangHoa nhap() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhập mã hàng:");
        String maHang = sc1.nextLine();
        System.out.println("Nhập tên hàng:");
        String tenHang = sc1.nextLine();
        System.out.println("Nhập số lượng tồn kho");
        try {
            soLuongTon = sc2.nextInt();
        } catch (Exception e) {
            sc2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        
        System.out.println("Nhập đơn giá: ");
        try {
            donGia = sc2.nextDouble();
        } catch (Exception e) {
            sc2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Nhập ngày sản xuất:");
            Date ngaySanXuat=null;
            Date ngayHetHan=null;
            try {
                ngaySanXuat = ngayVN.parse(sc1.nextLine()); 
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhập ngày hết hạn: ");
            try {
                ngayHetHan = ngayVN.parse(sc1.nextLine());
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhập nhà sản xuất");
            String nhaSanXuat = sc1.nextLine();
            hangHoa = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Nhập thời gian bảo hành:");
            int thoiGianBaoHanh = 0;
            try {
                thoiGianBaoHanh = sc2.nextInt();
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy !");
                e.printStackTrace();
            }
            System.out.println("Nhập công suất:");
            int congSuat = sc2.nextInt();
            hangHoa = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = sc1.nextLine();
            System.out.println("Nhập ngày nhập kho:");
            Date ngayNhapKho=null;
            try {
                ngayNhapKho = ngayVN.parse(sc1.nextLine());
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            hangHoa = new HangSangSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
        }

        return hangHoa;
    }

    public HangHoa suaHangHoa() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhập mã hàng:");
        String maHang = sc1.nextLine();
        System.out.println("Nhập tên hàng:");
        String tenHang = sc1.nextLine();
        System.out.println("Nhập số lượng tồn kho");
        try {
            soLuongTon = sc2.nextInt();
        } catch (Exception e) {
            sc2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        
        System.out.println("Nhập đơn giá: ");
        try {
            donGia = sc2.nextDouble();
        } catch (Exception e) {
            sc2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Nhập ngày sản xuất:");
            try {
                Date ngaySanXuat = ngayVN.parse(sc1.nextLine()); 
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhập ngày hết hạn: ");
            try {
                Date ngayHetHang = ngayVN.parse(sc1.nextLine());
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhà sản xuất");
            String nhaSanXuat = sc1.nextLine();
            hangHoa = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Nhập thời gian bảo hành:");
            int thoiGianBaoHanh = 0;
            try {
                thoiGianBaoHanh = sc2.nextInt();
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Nhập công suất:");
            int congSuat = sc2.nextInt();
            hangHoa = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = sc1.nextLine();
            System.out.println("Nhập ngày nhập kho:");
            try {
                Date ngayNhapKho = ngayVN.parse(sc1.nextLine());
            } catch (Exception e) {
                sc2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            hangHoa = new HangSangSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
        }

        return hangHoa;
    }
    
}
