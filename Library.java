//library has staff , readers and books
import java.util.Scanner;

public class Library{
	
	Scanner scan = new Scanner(System.in);
	Reader []rd;
		
		//constructor
	public Library(){
		rd = new Reader[2];
		rd[0] = new Teachers("John", false,"Biography",2,"Senior Professor" , "123", "Applied Geology");
		rd[1] = new Student("Harry",false, "Fiction", 1.5f,"student","234", "Electrical", 4, "Literature");
		
		System.out.println("______________________________________________________________________________________");
		
		System.out.println("\n @@@@@@@@@@@@@@@@@@@@@@@@@@@@@ WELCOME TO LIBRARY @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
	
	}//values and objects declared
	
	
	void Validity(Reader r){
		
		String ans;
		System.out.print("\n Are you a teacher or a student : ");
		ans = scan.nextLine();
		
		if(ans.equalsIgnoreCase("Teacher")){
			r = rd[0];
		}else{
			r = rd[1];
		}
		r.EnterDetailsOfReader();
		
		
		
	}
	
	
}//end class