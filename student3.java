import java.util.*;

class student
{
    String name;
    String Class;
    String fee;
    // String stdId;

    Random rnum = new Random();
    String stdId= "stdID/"+rnum.nextInt(10000);

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Name : "); 
        this.name= sc.nextLine();
    }

    public String getstdId() {
        return stdId;
    }

    public String getClass() {
        return Class;
    }

    public void setClass() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Class: ");  
        this.Class= sc.nextLine();
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Department : ");  
        this.department= sc.nextLine();
    }

    public void display(){
        System.out.println("\nName of student= "+ getName());
        System.out.println("Id of student= "+ getstdId());
        System.out.println("class Name of student= "+ getClass());
        System.out.println("Department of student= "+ getdepartment());
    }

    student(String name, String Class, String department){
        this.name = name;
        this.Class =Class;
        this.department = department;        
    }

  student(){
        this.stdId = stdId;
    }

    void info() {
      System.out.println(".........................................");
   }

   void info(String s) {
      System.out.println( "Details Entered sucessfully with Name: "+ s);
   }
}


public class Constructor_overloading_function_overloading
{


    public static void main (String arg[]){


       student stdOne = new student();
        Scanner input = new Scanner(System.in);
      	Scanner stdin = new Scanner(System.in);

        String ch;
        boolean run = true;
        while(run){
	        do{

		       stdOne.setName();
		        String name = stdOne.getName();


		        stdOne.setClass();
		        String Class = stdOne.getClass();


		       stdOne.setdepartment();
		        String department =stdOne.getdepartment();


		       student details = new student3(name,Class,department);
		        details.display();

		        stdOne.info();
		        details.info(stdOne.getName());

		        System.out.println("Want to add new student Details for sure? (y/n): ");
		        ch= stdin.next();

		    	} while(ch=="y" || ch == "Y");

		    	if (ch.equals("n")|| ch.equals("N")){
		    		System.out.println("Thank you");
		    		run=false;
	    	}
    	}
	}
} 