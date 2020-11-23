abstract class student                                            //abstract class
{ 
    protected String sName;
    boolean isExists;

    // Event class parameterized constructor
    public student(String sName) {
        this.sName = sName;                                //using this keyword to give reference 
        this.isExists=false;
    }

    public final String getsName() {                                      //using final keyword
        return sName;
    }

    abstract boolean getSponsership();

}

// derived class one
class office extends student

{

    public office(String sName) {
        // calling student class constructor
        super(sName);
    }


    public boolean getSponsership() {
        if (getsName() == "admissionoffice") {
            isExists=true;
        }
        return isExists;
    }
	
} 

//derived class two 
class Sports extends student
{ 

    public Sports(String sName) {
        
        super(sName);
    }

   
    public boolean getSponsership() {
        if (getsName() == "Anuj raj" || getsName()=="feemanagement") {
            isExists=true;
        }
        return isExists; 
    }
	
} 

// Driver class 
public class studentmanagement
{ 
	public static void main(String[] args) 
    {  
        String name="Check the fee and the Number of student under departement.";                                            //String class
        System.out.println("..................................................................");
        System.out.println(name);
        System.out.println(".................................................................."+"\n");
		// creating office object 
		student s1 = new office("admissionoffice"); 
		
		// creating delivery object 
		student s2 = new Sports("feemanagement staff"); 
        
        StringBuffer s = new StringBuffer("Official");                                //StringBuffer class
        s.append(" fee is managed by ");
        s.append(s1.getsName());
        s.append(":- ");
        s.append(s1.getSponsership());
		System.out.println(s);
		System.out.println("5 Official Staffs under department." + "\n");
        
        
        StringBuffer st = new StringBuffer("Sports"); 
        st.append(" admission is feemanagement office by ");
        st.append(s2.getsName());
        st.append(":- ");
        st.append(s2.getSponsership());
		System.out.println(st);
		System.out.println("2 staff under admission fee management department and 25 students.");
		 
		
	} 
} 