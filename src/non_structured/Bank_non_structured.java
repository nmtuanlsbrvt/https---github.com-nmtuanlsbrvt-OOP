package non_structured;

import java.util.Scanner;

public class Bank_non_structured {
    public static void main(String[] args) {
        int account_number =  12345;
        int account_banlance = 0;

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Nhap vao so tien gui");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount;

        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_banlance);

        System.out.println("Nhap vao so tien rut");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;

        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_banlance);
    }
    
}
