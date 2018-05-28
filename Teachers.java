//Teacher Is-A reader
import java.util.Scanner;

public class Teachers extends Reader{

	Scanner scan = new Scanner(System.in);
	
	String department;
	
	
	//constructor values are by default values
	public Teachers(String name, boolean hasLibraryCard, String bookTypeChosen, float timeDuration, String Designation,String readerID,String department){
		
		super(name,  hasLibraryCard, bookTypeChosen, timeDuration, Designation, readerID);
		this.department = department;
		
	}
	
	
	@Override
	void EnterDetailsOfReader(){
		Staff S = new Staff("Peter Pettigrew",6,"Henna Williams");
		
		System.out.println("Enter ::\n");
		System.out.print("Reader Name : ");
		this.name = scan.nextLine();
		System.out.print("Reader Designation : ");
		this.Designation = scan.nextLine();
		System.out.print("\n Show Library card (true/false): ");
		this.hasLibraryCard = scan.nextBoolean();
		
		if(this.hasLibraryCard == true){
			
			this.AlreadyRegistered();
			System.out.println("You are allowed in library ! ");
			
		}else{					//initially hasLibraryCard=false for new registration
			this.NewRegistration();
			System.out.println("Your readerID is : "+ this.getReaderID());
			
		}
		
		System.out.println("______________________________________________________________________________________");
		System.out.println("\n Book will be issued to "+ this.name + " by book issuer " + S.nameOfBookIssuer );
		
		System.out.print("Do you want to sort questions to be given in exams ? (yes/no) : ");
		String ans = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("........................................................................................");
		if(ans.equalsIgnoreCase("yes")){
			this.SortQuestions();
		}else{
			
			this.Reading();
		}
		System.out.println("______________________________________________________________________________________");
		
	
	}
	
	
	void NewRegistration(){
		
		System.out.println("\n Teacher name : " +name + "		Designation : "+ Designation + "		Department : "+department+"\n");
		this.setReaderID(name+"@123"+Designation);
		
	}
	
	void AlreadyRegistered(){
		
		
		System.out.println("The reader is already registered!");
		this.setReaderID(name+"@123"+Designation);
		System.out.println("\n Teacher name : " +name + "		Designation : "+ Designation + "		Department : "+department+"\n");
		System.out.println("Your readerID is : "+ this.getReaderID());
			
		
	}
	
	void SortQuestions(){
		System.out.println("\n"+name +" is a "+ Designation+ " in department : "+ department );
		System.out.println("\n"+name + " is sorting questions to be given in the exam question paper for students");
	}
	
}// end class