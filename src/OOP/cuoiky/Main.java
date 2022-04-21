package oop.cuoiky;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Consoleinput consoleinput = new Consoleinput();
        DanhSachHangHoa dshh = new DanhSachHangHoa();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        dshh.moi();

        do {
            System.out.println("-----------------MENU:----------------- ");
            System.out.println("\t1. Thêm hàng hóa.");
            System.out.println("\t2. Xóa hàng hóa.");
            System.out.println("\t3. Sửa hàng hóa.");
            System.out.println("\t4. In danh sách hàng hóa.");
            System.out.println("\t5. Tìm kiếm hàng hóa.");
            System.out.println("\t6. Thống kê hàng hóa.");
            System.out.println("\t7. Báo cáo hàng hóa.");
            System.out.println("\t8. Sắp xếp hàng hóa.");
            System.out.println("\t9. Đọc file");
            System.out.println("\t0. Thoát");
            System.out.println("-------------------------------------------");

            System.out.print("Chọn chức năng(Vui lòng nhập số): ");
            int key = sc2.nextInt();
            switch (key) {
                case 1:
                    do {
                        HangHoa hangHoa = consoleinput.nhap();
                        dshh.themHangHoa(hangHoa);
                        System.out.println("Quý khách có muốn nhập tiếp: Y/N");
                        sc1.nextLine();
                    } while (sc1.nextLine().equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\t1) Xóa hàng hóa theo mã hàng.");
                    System.out.println("\t2) Xóa hàng hóa theo tên hàng.");
                    System.out.println("Hãy chọn xóa hàng hóa theo? (Vui lòng chọn 1 trong 2 lựa chọn!!!):");
                    int chon = sc1.nextInt();
                    switch (chon) {
                        case 1:
                            dshh.xoaHangHoaTheoMaHang();
                            break;
                        case 2:
                            dshh.xoaHangHoaTheoTenHang();
                            break;
                        default:
                            System.out.println(" Vui lòng chọn 1 hoặc 2!!! Không nhập số vượt quá quy định!!! Xin cảm ơn");
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã hàng muốn sửa: ");
                    String maHang = sc1.nextLine();
                    dshh.suaHangHoa(maHang);
                    break;
                case 4:
                    System.out.println("\t1) In thông tin tất cả hàng hóa.");
                    System.out.println("\t2) In thông tin hàng thực phẩm.");
                    System.out.println("\t3) In thông tin hàng điện máy");
                    System.out.println("\t4) In thông tin hàng sánh sứ.");
                    System.out.println("Hãy chọn in thông tin loại hàng hóa theo (Vui lòng chọn 1 trong 4 lựa chọn!!!) ?");
                    int chon1 = sc1.nextInt();
                    switch (chon1) {
                        case 1:
                            dshh.inThongTinHangHoa();
                            break;
                        case 2:
                            dshh.inThongTinThucPham();
                            break;
                        case 3:
                            dshh.inThongTinDienMay();
                            break;
                        case 4:
                            dshh.inThongTinSanhSu();
                            break;
                        default:
                            System.out.println("Vui lòng nhập 1 đến 4!!! Không nhập số vượt quá quy định!!! Xin cảm ơn !!!");
                    }
                    break;
                case 5:
                    System.out.println("\t1) Tìm hàng hóa theo mã hàng.");
                    System.out.println("\t2) Tìm hàng hóa theo tên hàng.");
                    System.out.println("Hãy chọn tìm hàng hóa theo? (1 -> 2):");
                    int chon3 = sc1.nextInt();
                    switch (chon3) {
                        case 1:
                            dshh.timHangHoaTheoMa();
                            break;
                        case 2:
                            dshh.timHangHoaTheoTenHang();
                            break;
                        default:
                            System.out.println(" Chon 1 hoac 2 thoi be oi !!!");
                    }
                    break;
                case 6:
                    dshh.thongKeHangHoa();
                    break;
                case 7:
                    dshh.baoCao();
                    break;
                case 8:
                    dshh.sapXepHangHoa();
                    break;
                case 9:
                    System.out.println("Da ghi file !!!");
                    dshh.docFile();
                case 0:
                    System.out.println("Cam on da su dung chuong trinh !");
                    break;
                default:
                    System.out.println("Tu 1 den 9 thoi be oi !!!");
            }
            System.out.println("Về Menu(y/n)?: ");
        } while (dshh.sc1.nextLine().equals("y"));
    }

    
}
