  
package student_feemangement;

import java.util.Scanner;
        
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Prices p= new Prices();
       student_feemangement ob1= new student_feemangement();
        student ob2= new student();
        p.display();
        Thread t1= new Thread(ob1);
        Thread t2= new Thread(ob2);
        
        t2.start();

          try{
            ;
            Thread.sleep(7000);
          }
          catch(InterruptedException e)
          {System.out.println(e);} 
        t1.start();
       
        
        
        
    }
}