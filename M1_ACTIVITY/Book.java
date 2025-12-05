/**
 * 
 */
package M1_ACTIVITY;

/**
 * 
 */
public class Book {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewBook book = new NewBook();
		
		book.bookTitle = "The Book of Everyone";
		book.bookAuthor = "No One";

		String bookDetails = book.bookDetails();
		System.out.println(bookDetails);

	}

}

class NewBook{
	
	String bookTitle;
	String bookAuthor;
		
	public String bookDetails() {
        return "The book is titled: " + this.bookTitle + ", authored by " + this.bookAuthor;

    } 
	
}
