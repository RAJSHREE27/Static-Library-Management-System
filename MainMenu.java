//LIBRARY DRIVER PROGRAM

public class MainMenu{
	public static void main(String args[]){
		
		Library lib = new Library();
		Reader r = new Reader("Kate",false, "Biography",2.5f, "Senior office administrator","123");
		
		
		Books B = new Books("Subjectives",400,true,"Quantitative-Aptitude");
		Staff S = new Staff("Peter Pettigrew",6,"Henna Williams");
		
		
		B.ShowBookDetails();
		S.StaffDetails();
		
		System.out.println("\n @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		lib.Validity( r );	//takes constructor values
		
		
		
		
	}//end main
}//end class