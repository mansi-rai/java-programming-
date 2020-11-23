import java.util.*;

class statickey4{
	
	static int sno,s;
	
	static{
		sno= 10;
		System.out.println("The total student: "+ sno + "\n");
	}

	static void joinedstudent(){
		System.out.println("joined students: ");
		Scanner input= new Scanner(System.in);
		s= input.nextInt();
		sno= sno-s;
		System.out.println("cancelled addmission: "+ sno+ "\n");
	}

	static void Canceledaddmissiondetail(){
		System.out.println("How many Canceled addmission : ");
		Scanner input= new Scanner(System.in);
		s=input.nextInt();
		sno= sno-s;
		System.out.println("\nRemaining students: "+ sno);
	}

	public static void main(String args[]){
		
		joinedstudent();
		Canceledaddmissiondetail();

		System.out.println("\nSucessfully entered the Details and checked the students.");

	}
}