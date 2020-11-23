package student;

public class student_fee
{
     public int std_id;
     public String std_name;
     public String std_fee;
     public int a,b,c;
     int sum=0;
     int i = 5;

    public void Timer()
    {
        System.out.println("Fee Calculating.......\nPresenting in:");
        while (i>0){
          
         System.out.println(i+"  Seconds");
         try {
           i--;
           Thread.sleep(1000L);     //  prog 10 -thread implemented
           
          }
          catch (InterruptedException e) {
             System.out.println(e.getMessage());
          }
        }
    }

     public student_fee(int std, String nm, String on, int m1,int m2,int m3)
     {
          std_id = std;
          std_name = nm;
          std_fee=on;
          a = m1;
          b = m2;
          c = m3;
          sum = a+b+c;
     }
     public void display()
     {
          System.out.println("\nstudent id : "+std_id);
          System.out.println("student Name    : "+std_name);
          System.out.println("student fee   : "+std_fee);
          System.out.println("\n-----details-------");
          System.out.println("cash  : "+a);
          System.out.println("upi : "+b);
          System.out.println("credit card: "+c);
          System.out.println("Total option     : "+sum);
           if(sum>12 && sum<=15)
          {
             System.out.println("\nResult = stdid\n");
          }
          else if(sum>9 && sum<=12)
         {
            System.out.println("\nResult = stdname\n");
         }
         else if(sum>6 && sum<=9)
        {
           System.out.println("\n Result = stdfee\n"); 
        }
       else if(sum > 15)
       {
         System.out.println("Please enter the details  between 1 and 3-f");
       }
          
       System.out.println("------------------");
     }

}