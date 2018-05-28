import java.util.Scanner;

public class Reader{
	
	Scanner scan = new Scanner(System.in);
	
	String name;
	boolean hasLibraryCard;
	String bookTypeChosen;
	float timeDuration;
	String Designation;
	private String readerID;
	
	//constructor values are by default values
	public Reader(String name, boolean hasLibraryCard, String bookTypeChosen, float timeDuration, String Designation,String readerID){
		
		
		this.name = name;
		this.hasLibraryCard = hasLibraryCard;
		this.bookTypeChosen = bookTypeChosen;
		this.timeDuration = timeDuration;
		this.Designation = Designation;
		this.readerID = readerID;
		
	}
	public String getReaderID(){		//getter method
		return readerID;
	}
	
	public void setReaderID(String readerID){		//setter method
		this.readerID = readerID;
	}
	
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
		System.out.println("Book will be issued to "+ this.name + " by " + S.nameOfBookIssuer );
	}
	void AlreadyRegistered(){
		
		
		System.out.println("The reader is already registered!");
		this.setReaderID(name+"@123"+Designation);
		System.out.println("Your readerID is : "+ this.getReaderID());
			
		
	}
	
	void NewRegistration(){
		
		this.setReaderID(name+"@123"+Designation);
	}
	
	
	void Reading(){
		System.out.println("\n The reader is reading book in library silently");
	}
	
	void MakingNotes(){
		System.out.println(name+ " is reading and making notes !");
	}
	
}//end class