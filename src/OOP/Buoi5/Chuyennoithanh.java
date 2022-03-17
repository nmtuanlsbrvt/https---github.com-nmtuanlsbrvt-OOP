package oop.Buoi5;

public class Chuyennoithanh extends Chuyenxe{
    private double soTuyen;
    private double soKmDiDuoc;
    
	public double getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(double soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	public void setSoKmDiDuoc(double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	public Chuyennoithanh(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu, double soTuyen,
			double soKmDiDuoc) {
		super(maChuyenXe, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}
    @Override
    public void nhapDanhSach() {
        super.nhapDanhSach();
        System.out.println("So tuyen xe: ");
        setSoTuyen(sc.nextInt());
        System.out.println("So km di duoc: ");
        setSoKmDiDuoc(sc.nextDouble());
    }

	@Override
	public String toString() {
		return "Chuyenxenoithanh [soKmDiDuoc=" + soKmDiDuoc + ", soTuyen=" + soTuyen + "]";
	}
    
    
    
    
}
