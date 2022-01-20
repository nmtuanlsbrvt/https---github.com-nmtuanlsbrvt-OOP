package OOP.Buoi3;

public class Sinhviennew {
    float tuoi;
    String name;
    String khoa;
    boolean gioitinh;
    double diemThi;
    public Sinhviennew(Float tuoi, String name){
        this.tuoi = tuoi;
        this.name = name;
    }
    
    public Sinhviennew(Float tuoi, String name, String khoa, boolean gioitinh, double diemThi){
        this( tuoi, name);
        this.khoa = khoa;
        this.gioitinh = gioitinh;
        this.diemThi = diemThi;
    }
    void hoc(){
        System.out.println("hoc");
    }
}
