/**
 * 
 */
package M1_ACTIVITY;

/**
 * 
 */
public class Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewTree tree = new NewTree();
		
		tree.treeName = "Mango";
		tree.treeHeight = "1000 ft";

		String bookDetails = tree.retrunDetails();
		System.out.println(bookDetails);

	}

}

class NewTree{
	
	String treeName;
	String treeHeight;
		
	public String retrunDetails() {
        return "The tree: " + this.treeName + " has a height of " + this.treeHeight;

    } 
	
}
