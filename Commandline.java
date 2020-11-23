import java.util.Scanner;

public class Commandline {

 String StdName;
String StdEmail;
String Stdclass;
String Stdfee;
String Stdid;


 Commandline(String StdName,String Stdclass,String StdEmail,String Stdid,String Stdfee)
{
 this.StdName =StdName;
 this.Stdclass=Stdclass;
 this.StdEmail=StdEmail;
 this.Stdid=Stdid;
 this.Stdfee=Stdfee;
}

public Commandline() {
StdName=Stdclass=StdEmail=Stdid=Stdfee="";
}


public static void main(String args[])
{
int count = args.length;
if (count>=1) {
Commandline cm = new Commandline();
cm.StdName = args[0];
cm.Stdclass = args[1];
cm.StdEmail = args[2];
cm.Stdid=args[3];
cm.Stdfee=args[4];
System.out.println("\n\t STUDENT FEE DETAILS ENTERED SUCCESFULLY");
System.out.println("\nsStudent Name: :"+cm.StdName);
System.out.println("\n Student class:"+cm.Stdclass);
System.out.println("\n Student Email:"+cm.StdEmail);
System.out.println("\n Student ID:"+cm.Stdid);
System.out.println("\n Student Fee:"+cm.Stdfee);
}
else {

    System.out.print("Enter Student Name: ");
Scanner scanner = new Scanner(System. in);
    String StdName = scanner. nextLine();
    System.out.print("Enter class Name: ");
    String Stdclass = scanner. nextLine();
    System.out.print("Enter Student Email: ");
    String StdEmail = scanner. nextLine();
     System.out.print("Enter Student ID: ");
    String Stdid= scanner. nextLine();
    System.out.print("Enter Student Fee: ");
    String Stdfee = scanner. nextLine();

   
    Commandline cm = new Commandline(StdName,Stdclass,StdEmail,Stdid,Stdfee);
System.out.println("\n\t STUDENT FEE DETAILS ENTERED SUCCESSFULLY");
System.out.println("\n Student Name: :"+cm.StdName);
System.out.println("\n Student class:"+cm.Stdclass);
System.out.println("\n Student Email:"+cm.StdEmail);
System.out.println("\n Student Id:"+cm.Stdid);
System.out.println("\n Student Fee:"+cm.Stdfee);

scanner.close();
}
}



}