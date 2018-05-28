// library has staff

public class Staff{
	
	String nameOfLibrarian;
	int numberOfCleaningStaff;
	String nameOfBookIssuer;
	
	
	public Staff(String nameOfLibrarian ,int numberOfCleaningStaff , String nameOfBookIssuer){
		
		this.nameOfLibrarian= nameOfLibrarian;
		this. numberOfCleaningStaff = numberOfCleaningStaff;
		this. nameOfBookIssuer = nameOfBookIssuer;
		
	}
	
	void StaffDetails(){
		System.out.println();
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println(nameOfLibrarian + " - the Librarian who manages the library ");
		System.out.println(nameOfBookIssuer + " - the book issuer who issues books through library card of reader ");
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("there are "+numberOfCleaningStaff +" cleaning staff who regularly clean the library");
		System.out.println("They all are paid as per their work!");
		System.out.println();
	}
	
	
}//end class