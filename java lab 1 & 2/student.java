
import java.util.Scanner;


public class student {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Scanner stdin = new Scanner(System.in);

	int num;
        String arrayNames[] = new String[20];
        int arrayId[] = new int[20];
        String arrayclass[] = new String[10];
        int arrayfee[] = new int[20];

        System.out.println("Enter the Number of student :  ");
	num = input.nextInt();



       System.out.println("Do You want to add more (y/n):");

       if (stdin.next().startsWith("y")){
      	for (int i = 0 ; i < num ; i++ ) {
           System.out.println("\n Enter the StudentId: ");
	   arrayId[i] = input.nextInt(); 
           System.out.println("\n Enter the studentName: ");
	   arrayNames[i] = stdin.next();
           System.out.println("\n Enter the class: ");
	   arrayclass[i] = stdin.next();
           System.out.println("\n Enter the studentfee: ");
	   arrayfee[i] = stdin.nextInt();

	


         } 
      }


	PrintStudentDetails(arrayNames,arrayId,arrayclass,arrayfee);

        input.close();
        stdin.close();
   }
   public static void PrintStudentDetails(String arrNames[],int arrIds[],String arrclass[],int arrfee[]){

        int n = arrNames.length;
	System.out.println("\n\nStudent add details:  ");
        for (int i = 0; i < n; i++) {
		if (arrNames[i] != null){
            System.out.println("Student Id: "+arrIds[i]+" Student Name: "+arrNames[i]+" Student class: "+arrclass[i]+"Student fee: "+arrfee[i]);
    	}  
       }
    }
}

