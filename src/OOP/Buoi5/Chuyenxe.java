package oop.Buoi5;

import java.util.Scanner;

public class Chuyenxe {
    private String maChuyenXe;
    private String tenTaiXe;
    private String soXe;
    private double doanhThu;

	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String d) {
		this.soXe = d;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public Chuyenxe(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu) {
		this.maChuyenXe = maChuyenXe;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

    public void nhapDanhSach(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma so chuyen xe: ");
        setMaChuyenXe(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        setTenTaiXe(sc.nextLine());
        System.out.println("Nhap so xe: ");
        setSoXe(sc.nextLine());
        System.out.println("Nhap doanh thu: ");
        setDoanhThu(sc.nextDouble());
    }

	@Override
	public String toString() {
		return "Chuyenxe [doanhThu=" + doanhThu + ", maChuyenXe=" + maChuyenXe + ", soXe=" + soXe + ", tenTaiXe="
				+ tenTaiXe + "]";
	}
	 
    
    
	}

    
    

