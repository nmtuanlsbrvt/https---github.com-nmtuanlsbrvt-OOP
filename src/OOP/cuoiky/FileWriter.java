package oop.cuoiky;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class FileWriter {
    public static void writeFile(String fileName, List<HangHoa> listHangHoa){
        File file = new File(fileName);

        PrintWriter out;
        try{
            out = new PrintWriter(file);
            for (HangHoa hangHoa : listHangHoa) {
                out.println(hangHoa);
            }
            out.close();
        } catch (FileNotFoundException f){
            System.out.println("File lỗi rồi! Vui lòng thử lại! Xin cảm ơn");
            f.printStackTrace();
        }


        
    }
    
}
