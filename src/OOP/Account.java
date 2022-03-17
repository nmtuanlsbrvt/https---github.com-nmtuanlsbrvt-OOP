package oop;

import java.util.Scanner;

public class Account {
    int account_number =  12345;
    int account_ballance = 0;
    Scanner sc = new Scanner(System.in);

         void withdraw(){
            System.out.println("Nhap vao so tien rut");
                int withdrawAmount = 0;
                withdrawAmount = sc.nextInt();
                account_ballance -= withdrawAmount;
        }
         void deposit(){
            System.out.println("Nhap vao so tien gui");
                int depositAmount = 0;
                depositAmount = sc.nextInt();
                account_ballance += depositAmount;
        }
          void show(){
            System.out.println("Thong tin tai khoan");
                System.out.println("Account number: " + account_number);
                System.out.println("Account balance: "+ account_ballance);
    
}
}