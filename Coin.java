//Class to implement Merkle Tree
//@Cameron Nordan
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Coin extends TreeNode {

	private byte[] hash;
	private String[] input;
	private String[] results;
	private String finalhash;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	
public static void main(String[]args)
{
   Coin test = new Coin();
   /*
   test.fillTree();
   test.printarray();
   test.hashTree();
   test.printarray();
   */
	System.out.println(test.sha256("test1"));
}
public Coin()
{
	super(null,null, null, null);
	input = new String[7];
	
}

	public byte[] sha256(String unhashed) {
		byte[] digested = unhashed.getBytes();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			digested= md.digest(digested);
		} catch (NoSuchAlgorithmException cnse) {
			System.out.println("Could not digest.");
		}
		return digested;
	}
public void printarray()
{
	for(int i = 0; i < 7; i++)
	{
		System.out.println(input[i]);
	}
}
	
	public String merkleroot(byte[] input){
		String root = input.toString();
		return root;
	}
	
	public void fillTree()
	{
		for(int i =0; i < 5; i++)
		{
			input[i] = "test" + i;
		}
		
	}
	
	public TreeNode hashTwo(int ind1, int ind2)
	{
		String concat = "";
		TreeNode first = new TreeNode(null, null, null, null);
		TreeNode second = new TreeNode(null, null, null, null);
		
		
			first.setItem(sha256(input[ind1]));
			second.setItem(sha256(input[ind2]));
			concat = first.getItem().toString() + second.getItem().toString();
			first.getParent().setItem(concat.getBytes());
			second.setParent(first.getParent());
			first.getParent().setItem(sha256(concat));
			
		return first.getParent();
			
	}
	public String hashTree()
	{
		TreeNode parent = hashTwo(0,1);
		TreeNode parent2 = hashTwo(2,3);
		input[4] = parent.getItem().toString();
		input[5] = parent2.getItem().toString();
		TreeNode finale = hashTwo(4,5);
		input[6] = finale.getItem().toString();
		return finale.getItem().toString();
	}
		
	}
	
	


