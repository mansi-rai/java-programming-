import student.std_fee;
import java.util.*;
import java.lang.*;
import java.io.*;
class Mainstudent
{
     public static void main(String[] args)
     {
          String nm,on;
          int Event;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("\nDIRECTIONS FOR paying fee:1.cash  2.upi  3.credit card  4.debit card");
          System.out.println("Enter INFORMATION here");
          System.out.print("Enter std id:= ");
          Event = sc.nextInt();
          System.out.print("Enter std Name:= ");
          nm = sc.next();
          System.out.print("Enter std fee:= ");
          on = sc.next();
          int m1,m2,m3;
          System.out.println("pay fee For 1)registration 2)admission  3)exam  \n");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          std_fee s = new std_fee(Event, nm, on, m1, m2, m3);
     
          s.Timer();
          s.display();
     }
}