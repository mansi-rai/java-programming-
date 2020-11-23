package student_feemanagement;

import java.util.*;
import java.io.*;

interface student_details{  
	float price();  
}  
class student_id implements student_details{  
	public float student(){return 50f;}  
}  
class student_name implements student_details{  
	public float student(){return 100f;}  
} 
class student_fee implements student_details{  
	public float student(){return 200f;}  
} 
class student_address implements student_details{  
	public float student(){return 500f;}  
}  
class students{  
	public void display(){  
	student_details student_id= new student_id(); 
	student_details student_fee= new student_fee();
	student_details student_name= new student_name();
	student_details student_address= new student_address();
        		System.out.println("\n********************************************************* ");
        		System.out.println("here are the student fee details:- \n");
	                System.out.println("student id: Rs. "+student_id.students()+""); 
	            
	            	System.out.println("student fee: Rs. "+student_fee.students()+""); 
	             
	                System.out.println("student name: Rs. "student_name.students()+""); 
	            
	                System.out.println("student address: Rs. "student_address.students()+"\n"); 
 
	}
}  