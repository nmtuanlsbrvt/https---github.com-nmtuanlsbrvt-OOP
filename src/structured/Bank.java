package structured;

import java.util.Scanner;

public class Bank {
       static int account_number =  12345;
        static int account_ballance = 0;
        static Scanner input;
    public static void main(String[] args) {
        
        input = new Scanner(System.in);

        show();
        
        withdraw();

        depoisit();
    }

}
static void withdraw(){
    System.out.println("Nhap vao so tien rut");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_ballance -= withdrawAmount;
}
static void deposit(){
    System.out.println("Nhap vao so tien gui");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_ballance += depositAmount;
}
static void show(){
    System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_ballance);
}