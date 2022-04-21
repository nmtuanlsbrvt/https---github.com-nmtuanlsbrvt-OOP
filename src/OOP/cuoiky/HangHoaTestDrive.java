package oop.cuoiky;

import java.text.ParseException;

public class HangHoaTestDrive {
        public static void main(String[] args) throws ParseException {
            DanhSachHangHoa dshh = new DanhSachHangHoa();
            String nhapTiep;
            
            Consoleinput consoleinput = new Consoleinput();
    
            do{
                HangHoa hangHoa = consoleinput.nhap();
                dshh.themHangHoa(hangHoa);
                System.out.println("Quý khách có muốn nhập tiếp không: Y/N");
                nhapTiep = consoleinput.sc1.nextLine();
            }while(nhapTiep.equalsIgnoreCase("y"));
    
            dshh.moi();
            dshh.inThongTinHangHoa();
        }
    
        
    }
