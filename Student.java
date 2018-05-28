
//student is-a reader

import java.util.Scanner;


public class Student extends Reader{
	
	
	Scanner scan = new Scanner(System.in);
	
	
	String branch;
	int semester;
	String fieldOfInterest;
	
	//constructor values are by default values
	public Student(String name, boolean hasLibraryCard, String bookTypeChosen, float timeDuration, String Designation,String readerID ,String branch,int semester,String fieldOfInterest){
		
		super( name, hasLibraryCard, bookTypeChosen, timeDuration, Designation,readerID);
		this.branch = branch;
		this.semester = semester;
		this.fieldOfInterest = fieldOfInterest;
		
	}
	
	@Override
	void EnterDetailsOfReader(){

		Staff S = new Staff("Peter Pettigrew",6,"Henna Williams");
		
		System.out.println("Enter ::\n");
		System.out.print("Reader Name : ");
		this.name = scan.nextLine();
		System.out.print("Reader Branch : ");
		this.branch = scan.nextLine();
		System.out.print("Reader semester(1-8) : ");
		this.semester = scan.nextInt();
		
		if(this.semester >=1 && this.semester<=8){
			
				System.out.print("\n Show Library card (true/false): ");
				this.hasLibraryCard = scan.nextBoolean();
				
				if(this.hasLibraryCard == true){
					
					this.AlreadyRegistered();
					System.out.println("You are allowed in library ! ");
					
					
				}else{					//initially hasLibraryCard=false for new registration
					this.NewRegistration();
					System.out.println("Your readerID is : "+ this.getReaderID());
					
				}
				System.out.println("\n___________________________________________________________________________________\n");
				System.out.println("\n Book will be issued to "+ this.name + " by book issuer " + S.nameOfBookIssuer );
				
				System.out.print("\n Do you want to solve questions for exam preparations ? (yes/no) : ");
				String ans = new java.util.Scanner(System.in).nextLine();
				
				if(ans.equalsIgnoreCase("yes")){
					this.SolveQuestions();
				}else{
					
					this.Reading();
				}
				System.out.print("\n Do you want to make notes too ? (yes/no) : ");
				String more = new java.util.Scanner(System.in).nextLine();
				System.out.println("\n.......................................................................................");
				if(more.equalsIgnoreCase("yes")){
					
					this.MakingNotes();
					
				}else{
					
					this.Reading();
				}
				System.out.println("___________________________________________________________________________________\n");
		}
		else{
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID SEMESTER");
	  
		}
	}
	
	//------------------------------------------------------------------------------------------------------------------
	
	
	void NewRegistration(){
	
		System.out.println("\n Student name : "+ name + "		branch : "+branch + "		Semester : "+ semester+ "\n");
		this.setReaderID(name+"@123"+branch+semester);
		
	}
	
	
	void AlreadyRegistered(){
		
		
		System.out.println("The reader is already registered!");
		this.setReaderID(name+"@123"+branch+semester);
		System.out.println("\n Student name : "+ name + "		branch : "+branch + "		Semester : "+ semester+"\n");
		System.out.println("Your readerID is : "+ this.getReaderID());
			
		
	}
	
	
	void SolveQuestions(){
		System.out.println(name + " is solving problems and doing calculative work");
		
	}
	
}//end class