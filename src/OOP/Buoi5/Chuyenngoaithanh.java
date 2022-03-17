package oop.Buoi5;

public class Chuyenngoaithanh extends Chuyenxe {
    private String noiDen;
    private double soNgayDiDuoc;

	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public double getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(double soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
    @Override
    public void nhapDanhSach() {

        super.nhapDanhSach();
        System.out.println("Nhap noi den: ");
        setNoiDen(sc.nextLine());
        System.out.println("Nhap so ngay di duoc: ");
        setSoNgayDiDuoc(sc.nextDouble());
    }
	@Override
	public String toString() {
		return "Chuyenxengoaithanh [noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + "]";
	}
    
    
    
}
