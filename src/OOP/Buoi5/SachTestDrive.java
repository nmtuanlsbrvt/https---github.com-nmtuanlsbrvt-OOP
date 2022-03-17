package oop.Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> sachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> sachThamKhao = new ArrayList<>();

        double tongTTSGK =0 ;
        double tongTTSTK =0;
        double tbSTK =0;
        double tongDonGiaSTK =0;


        System.out.print("Nhap so sach giao khoa: ");
        int nGK = sc.nextInt();
        
        for(int i =0; i<nGK;i++){
            System.out.println("Sach thu"+(i+1));
            SachGiaoKhoa newSachGiaoKhoa = new SachGiaoKhoa();
            newSachGiaoKhoa.nhapDS();
            sachGiaoKhoa.add(newSachGiaoKhoa);
            tongTTSGK += sachGiaoKhoa.get(i).getThanhTien();
        }
        System.out.print("Nhap so sach tham khao: ");
        int nTK = sc.nextInt();
        for(int i =0; i<nTK;i++){
            System.out.println("Sach thu"+(i+1));
            SachThamKhao newSachThamKhao = new SachThamKhao();
            newSachThamKhao.nhapDS();
            sachThamKhao.add(newSachThamKhao);
            tongTTSTK += sachThamKhao.get(i).getThanhTien(); 
            tongDonGiaSTK += sachThamKhao.get(i).getDonGia();
        }
        System.out.println("-----Sach giao khoa-----");
        for(int i =0; i<nGK;i++){
            System.out.println("Sach thu"+(i+1));
            System.out.println(sachGiaoKhoa.get(i).toString());
        }
        System.out.println("-----Sach tham khao-----");
        for(int i =0; i<nTK;i++){
            System.out.println("Sach thu"+(i+1));
            System.out.println(sachThamKhao.get(i).toString());
        }
        tbSTK = tongDonGiaSTK/nTK;
        System.out.println("Trung binh cong don gia sach tham khao: "+tbSTK);

        sc.nextLine();
        System.out.print("Nhap ten nha xuat ban muon tra cuu: ");
        String tenNXB = sc.nextLine();
        for(int i =0; i<nGK;i++){
            if(sachGiaoKhoa.get(i).getNhaXB().equalsIgnoreCase(tenNXB)){
                System.out.println(sachGiaoKhoa.get(i).toString());
            }
            
        }

    }
    }
    

