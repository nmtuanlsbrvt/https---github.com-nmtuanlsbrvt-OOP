package oop.Buoi5;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        Chuyenxe chuyenxe = new Chuyenxe();

        ArrayList<ChuyenNoiThanh> chuyenNoiThanh = new ArrayList<>();
        ArrayList<ChuyenNgoaiThanh> chuyenNgoaiThanh = new ArrayList<>();
        double doanhThuNoiThanh = 0 ;
        double doanhThuNgoaiThanh = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so chuyen xe noi thanh: ");
        int n1 = sc.nextInt();
        
        
        for(int i =0; i<n1;i++){
            System.out.println("Xe "+(i+1));
            ChuyenNoiThanh newChuyenNoiThanh = new ChuyenNoiThanh();
            newChuyenNoiThanh.nhapDanhSach();
            chuyenNoiThanh.add(newChuyenNoiThanh);
            doanhThuNoiThanh += chuyenNoiThanh.get(i).getDoanhThu();
        }
        
        System.out.println("Nhap so chuyen xe ngoai thanh: ");
        int n2 = sc.nextInt();
        for(int i =0; i<n2;i++){
            System.out.println("Xe "+(i+1));
            ChuyenNgoaiThanh newChuyenNgoaiThanh = new ChuyenNgoaiThanh();
            newChuyenNgoaiThanh.nhapDanhSach();
            chuyenNgoaiThanh.add(newChuyenNgoaiThanh);
            doanhThuNgoaiThanh += chuyenNgoaiThanh.get(i).getDoanhThu();
        }

        System.out.println("----Chuyen noi thanh----");
        for(int i =0; i<n1;i++){
            System.out.println("Xe "+(i+1));
            System.out.println(chuyenNoiThanh.get(i).toString()); 
        }
        System.out.println("----Chuyen ngoai thanh----");
        for(int i =0; i<n2;i++){
            System.out.println("Xe "+(i+1));
            System.out.println(chuyenNgoaiThanh.get(i).toString()); 
        }

        System.out.println("Tong doanh thu xe noi thanh: "+doanhThuNoiThanh);
        System.out.println("Tong doanh thu xe ngoai thanh: "+doanhThuNgoaiThanh);




    }
    }
}
