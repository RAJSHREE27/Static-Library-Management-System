// Library has books

public class Books{
	
	String category;		
	int numberOfPages;
	boolean isAvailable;
	String bookName;
	
	public Books(String category, int numberOfPages ,  boolean isAvailable, String bookName){
			
			this.category = category;
			this.numberOfPages = numberOfPages;
			this. isAvailable = isAvailable;
			this.bookName = bookName;
			
	}
	void ShowBookDetails(){
		
		System.out.println("\n *********** Details of Books in Library ***************\n");
		System.out.println("This Library has different categories of books : ");
		System.out.println("\t -> FICTION");
		System.out.println("\t -> NOVEL");
		System.out.println("\t -> SUBJECTIVES");
		System.out.println("\t -> BIOGRAPHIES");
		System.out.println("\t -> KIDS STORY BOOKS ");
		System.out.println("\t -> LAW BOOKS AND THE CONSTITUTION");
		System.out.println("\t -> HOLY BOOKS");
		System.out.println("\t -> POETRY");
		System.out.println("\t -> MAGAZINE STUFFS");
		
		
	}
	
}//end class